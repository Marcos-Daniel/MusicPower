/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.ItensCompra;
import br.edu.ifnmg.MusicPower.Entidades.ItensCompraRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marcos
 */
public class ItensCompraDAO extends DAOGenerica<ItensCompra> implements ItensCompraRepositorio {
    public ItensCompraDAO() throws SQLException{
        setConsultaSalvar("INSERT INTO itenscompra (compra, produto, valor)VALUES(?,?,?)");
        setConsultaAlterar("UPDATE itenscompra SET compra = ?, produto = ?, valor =?, WHERE datacompra = ?");
        setConsultaExcluir("DELETE FROM itenscompra WHERE id = ?");
        setConsultaAbrir("SELECT id,compra, produto, valor FROM ItensCompra from id = ?");
    }
    @Override
    public ItensCompra preencherObjeto(ResultSet resultado) throws SQLException {
        try {
            ItensCompra tmp = new ItensCompra();
            tmp.setId(resultado.getInt(1));
            tmp.setCompra(resultado.getInt(2));
            tmp.setProduto(resultado.getInt(3));
            tmp.setValor(resultado.getDouble(4));
            return tmp;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    @Override
    public void preencherConsulta(PreparedStatement sql, ItensCompra obj) throws SQLException{
        sql.setInt(1, obj.getCompra());
        sql.setInt(2, obj.getProduto());
        sql.setDouble(3, obj.getValor());
    }

    @Override
    protected void preencheFiltros(ItensCompra filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, ItensCompra filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
