/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Conta;
import br.edu.ifnmg.MusicPower.Entidades.ContaRepositorio;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breno
 */
public class ContaDAO extends DAOGenerica<Conta> implements ContaRepositorio {
    public ContaDAO(){
        setConsultaSalvar("INSERT INTO conta(descricao, valor, mesReferente, vencimento,StatusConta)VALUES(?,?,?,?,?)");
        setConsultaAlterar("UPDATE conta SET descricao = ?, valor = ?, mesReferente = ?, vencimento = ?,StatusConta = ? WHERE id = ?");
        setConsultaExcluir("DELETE FROM conta WHERE id = ?");
        setConsultaAbrir("SELECT id,descricao,valor,mesReferente,vencimento,StatusConta FROM conta");
    }
    
    @Override
    public Conta Abrir(String mes) throws SQLException{
        try{
            PreparedStatement sql = conn.prepareStatement("SELECT id,descricao,valor,mesReferente,vencimento,StatusConta FROM WHERE mesReferente = ?");
            sql.setString(1,mes);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()) return preencheObjeto(resultado);
        } catch(SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheFiltros(Conta filtro) {
       if(filtro.getId() > 0) adicionarFiltro("id", "=");
       if(filtro.getDescricao()!= null) adicionarFiltro("descricao", "=");
       if(filtro.getMesReferente()!= null) adicionarFiltro("mesreferente", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Conta filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getDescricao()!= null ){ sql.setString(cont, filtro.getDescricao()); cont++; }
            if(filtro.getMesReferente()!= null){ sql.setString(cont, filtro.getMesReferente()); cont++; }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(ContaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected Conta preencheObjeto(ResultSet resultado) {
         try {
            Conta tmp = new Conta();
            tmp.setId(resultado.getInt(1));
            tmp.setDescricao(resultado.getString(2));
            tmp.setValor(resultado.getDouble(3));
            tmp.setMesReferente(resultado.getString(4));
            tmp.setVencimento(resultado.getDate(5));
            tmp.setStatus(resultado.getString(6));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Conta obj) {
         try{
            sql.setString(1, obj.getDescricao());
            sql.setDouble(2, obj.getValor());
            sql.setString(3, obj.getMesReferente());
            sql.setDate(4, (Date) obj.getVencimento());
            sql.setString(5, obj.getStatus());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
}
