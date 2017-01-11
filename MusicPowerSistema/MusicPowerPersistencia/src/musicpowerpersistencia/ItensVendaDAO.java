/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.ItensVenda;
import br.edu.ifnmg.MusicPower.Entidades.ItensVendaRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marcos
 */
public class ItensVendaDAO extends DAOGenerica<ItensVenda> implements ItensVendaRepositorio {
    public ItensVendaDAO() throws SQLException{
        setConsultaSalvar("INSERT INTO itensvenda (venda, produto, valor)VALUES(?,?,?)");
        setConsultaAlterar("UPDATE itensvenda SET venda = ?, produto = ?, valor =?, WHERE datacompra = ?");
        setConsultaExcluir("DELETE FROM itensvenda WHERE id = ?");
        setConsultaAbrir("SELECT id,venda, produto, valor FROM ItensVenda from id = ?");
    }
    @Override
    public ItensVenda preencherObjeto(ResultSet resultado) throws SQLException {
        try {
            ItensVenda tmp = new ItensVenda();
            tmp.setId(resultado.getInt(1));
            tmp.setVenda(resultado.getInt(2));
            tmp.setProduto(resultado.getInt(3));
            tmp.setValor(resultado.getDouble(4));
            return tmp;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    @Override
    public void preencherConsulta(ItensVenda obj,PreparedStatement sql) throws SQLException{
        sql.setInt(1, obj.getVenda());
        sql.setInt(2, obj.getProduto());
        sql.setDouble(3, obj.getValor());
    }   
}
