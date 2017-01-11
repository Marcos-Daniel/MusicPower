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

/**
 *
 * @author marcos
 */
public class VendaDAO extends DAOGenerica<Venda> implements VendaRepositorio {
    public VendaDAO() throws SQLException{
        setConsultaSalvar("INSERT INTO venda (cliente,valor,datavenda)VALUES(?,?,?)");
        setConsultaAlterar("UPDATE venda SET cliente = ?, valor = ?, datavenda = ?, WHERE datacompra = ?");
        setConsultaExcluir("DELETE FROM venda WHERE id = ?");
        setConsultaAbrir("SELECT id,cliente,valor,datavenda FROM venda WHERE id = ?");
    }
    @Override
    public Venda preencherObjeto(ResultSet resultado) throws SQLException{
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
    public void preencherConsulta(Venda obj,PreparedStatement sql) throws SQLException{
        try{
            sql.setInt(1, obj.getCliente());
            sql.setDouble(2, obj.getValor());
            sql.setDate(3, obj.getDataVenda());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }   

    @Override
    protected void preencheFiltros(Venda filtro) {
       if(filtro.getId() > 0) adicionarFiltro("id", "=");
       if(filtro.getDataVenda()!= null) adicionarFiltro("dataVenda", "="); 
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Venda filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
