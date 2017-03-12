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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcos
 */
public class ItensCompraDAO extends DAOGenerica<ItensCompra> implements ItensCompraRepositorio {

    public ItensCompraDAO() throws SQLException {
        setConsultaSalvar("INSERT INTO itensCompra (fk_compra, fk_produto, qtd, valor)VALUES(?,?,?,?)");
        setConsultaAlterar("UPDATE itensCompra SET fk_compra = ?, fk_produto = ?, valor =?, WHERE datacompra = ?");
        setConsultaExcluir("DELETE FROM itensCompra WHERE id = ?");
        setConsultaAbrir("SELECT id, fk_compra, fk_produto, valor FROM itensCompra from id = ?");
    }

    @Override
    protected void preencheFiltros(ItensCompra filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, ItensCompra filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected ItensCompra preencheObjeto(ResultSet resultado) {
        try {
            ItensCompra tmp = new ItensCompra();
            tmp.setId(resultado.getInt(1));
            tmp.setCompra(resultado.getInt(2));
            tmp.setProduto(resultado.getInt(3));
            tmp.setQtd(resultado.getInt(4));
            tmp.setValor(resultado.getDouble(5));
            return tmp;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, ItensCompra obj) {
        try {
            sql.setInt(1, obj.getCompra());
            sql.setInt(2, obj.getProduto());
            sql.setInt(3, obj.getQtd());
            sql.setDouble(4, obj.getValor());
        } catch (SQLException ex) {
            Logger.getLogger(ItensCompraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
