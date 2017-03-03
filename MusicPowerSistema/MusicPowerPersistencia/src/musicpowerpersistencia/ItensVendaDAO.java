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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcos
 */
public class ItensVendaDAO extends DAOGenerica<ItensVenda> implements ItensVendaRepositorio {
    public ItensVendaDAO() throws SQLException{
        setConsultaSalvar("INSERT INTO itensVenda (fk_venda, fk_produto, qtd, valor)VALUES(?,?,?,?)");
        setConsultaAlterar("UPDATE itensvenda SET venda = ?, produto = ?, valor =?, WHERE datacompra = ?");
        setConsultaExcluir("DELETE FROM itensvenda WHERE id = ?");
        setConsultaAbrir("SELECT id,venda, produto, valor FROM ItensVenda from id = ?");
    }

    @Override
    protected void preencheFiltros(ItensVenda filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, ItensVenda filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected ItensVenda preencheObjeto(ResultSet resultado) {
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
    protected void preencheConsulta(PreparedStatement sql, ItensVenda obj) {
        try {
            sql.setInt(1, obj.getVenda());
            sql.setInt(2, obj.getProduto());
            sql.setInt(3, obj.getQtd());
            sql.setDouble(4, obj.getValor());
        } catch (SQLException ex) {
            Logger.getLogger(ItensVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}
