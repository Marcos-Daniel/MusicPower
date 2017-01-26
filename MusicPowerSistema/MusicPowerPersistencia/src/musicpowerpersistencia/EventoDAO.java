/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Evento;
import br.edu.ifnmg.MusicPower.Entidades.EventoRepositorio;
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
public class EventoDAO extends DAOGenerica<Evento> implements EventoRepositorio {
    public EventoDAO() {
        setConsultaSalvar("INSERT INTO evento(descricao, inicio, fim, valor, statusEvento)VALUES(?,?,?,?,?)");
        setConsultaAlterar("UPDATE evento SET descricao = ?, inicio = ?, fim = ?, valor = ?, statusEvento = ? WHERE id = ?");
        setConsultaExcluir("DELETE FROM evento WHERE id = ?");
        setConsultaAbrir("SELECT id, descricao, inicio, fim, valor, statusEvento FROM WHERE id = ?");
    }
    
    @Override
    public Evento Abrir (String descricao){
        try{    
            PreparedStatement sql = conn.prepareStatement("SELECT id, descricao, inicio, fim, valor, statusEvento FROM WHERE descricao = ?");
            sql.setString(1, descricao);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()) return preencheObjeto(resultado);
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    } 

    @Override
    protected void preencheFiltros(Evento filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getDescricao()!= null) adicionarFiltro("descricao", "=");
        if(filtro.getInicio()!= null) adicionarFiltro("cpf", "=");
        if(filtro.getTermino()!= null) adicionarFiltro("termino", "=");
        if(filtro.getValor()!= null) adicionarFiltro("valor", "=");
        if(filtro.getDescricao()!= null) adicionarFiltro("descricao", "=");
        if(filtro.getStatus()!= null) adicionarFiltro("status", "=");
    }

    @Override()
    protected void preencheParametros(PreparedStatement sql, Evento filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getDescricao() != null ){ sql.setString(cont, filtro.getDescricao()); cont++; }
            if(filtro.getInicio()!= null){ sql.setDate(cont, (Date) filtro.getInicio()); cont++; }
            if(filtro.getTermino()!= null){ sql.setDate(cont, (Date) filtro.getTermino()); cont++; }
            if(filtro.getValor() != null ){ sql.setDouble(cont, filtro.getValor()); cont++; }
            if(filtro.getStatus()!= null ){ sql.setString(cont, filtro.getStatus()); cont++; }
            
        } catch (SQLException ex) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected Evento preencheObjeto(ResultSet resultado) {
        try {
            Evento tmp = new Evento();
            tmp.setId(resultado.getInt(1));
            tmp.setDescricao(resultado.getString(2));
            tmp.setInicio(resultado.getDate(3));
            tmp.setTermino(resultado.getDate(4));
            tmp.setValor(resultado.getDouble(5));
            tmp.setStatus(resultado.getString(6));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Evento obj) {
         try{
            sql.setString(1, obj.getDescricao());
            sql.setDate(2, (Date) obj.getInicio());
            sql.setDate(3, (Date) obj.getTermino());
            sql.setDouble(4, obj.getValor());
            sql.setString(5, obj.getStatus());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }

}
