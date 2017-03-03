/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Venda;
import br.edu.ifnmg.MusicPower.Entidades.VendaRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcos
 */
public class VendaDAO extends DAOGenerica<Venda> implements VendaRepositorio {
    Venda tmp;
    public VendaDAO() throws SQLException{
        setConsultaSalvar("INSERT INTO venda (fk_cliente,fk_funcionario,valor,datavenda)VALUES(?,?,?,?)");
        setConsultaAlterar("UPDATE venda SET cliente = ?, valor = ?, datavenda = ?, WHERE datacompra = ?");
        setConsultaExcluir("DELETE FROM venda WHERE id = ?");
        setConsultaAbrir("SELECT id,cliente,valor,datavenda FROM venda WHERE id = ?");
    }

    @Override
    protected void preencheFiltros(Venda filtro) {
       if(filtro.getId() > 0) adicionarFiltro("id", "=");
       if(filtro.getDataVenda()!= null) adicionarFiltro("dataVenda", "="); 
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Venda filtro) { try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getDataVenda()!= null ){ sql.setDate(cont, filtro.getDataVenda()); cont++; }
             
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected Venda preencheObjeto(ResultSet resultado) {
       try{
            Venda tmp = new Venda();
            tmp.setId(resultado.getInt(1));
            tmp.setCliente(resultado.getInt(2));
            tmp.setValor(resultado.getDouble(3));
            tmp.setDataVenda(resultado.getDate(4));
            return tmp;
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Venda obj) {
          try{
            sql.setInt(1, obj.getCliente());
            sql.setInt(2, obj.getFuncionario());
            sql.setDouble(3, obj.getValor());
            sql.setDate(4, obj.getDataVenda());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }

    @Override
    public int buscarUltimoId() {
        try {
            PreparedStatement sql = conn.prepareStatement("SELECT MAX(ID) as id FROM venda");
            ResultSet resultado = sql.executeQuery();
            
            if(resultado.next()){
                int tmp = resultado.getInt(1);
                return tmp; 
            }
        } catch (SQLException ex) {
            System.out.println(ex + "Dg Abrir");
        }
        return 0;
    }
    
}
