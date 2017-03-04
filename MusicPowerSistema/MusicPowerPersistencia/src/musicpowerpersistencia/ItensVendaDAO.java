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
        setConsultaExcluir("DELETE FROM itensVenda WHERE k_venda = ?");
        setConsultaAbrir("SELECT id,fk_venda, fk_produto, qtd, valor FROM itensVenda");
        setConsultaBusca("SELECT id,fk_venda, fk_produto, qtd, valor FROM itensVenda");
    }

    @Override
    protected void preencheFiltros(ItensVenda filtro) {
        adicionarFiltro("fk_venda", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, ItensVenda filtro) {
        try {
            sql.setInt(1, filtro.getVenda());
        } catch (SQLException ex) {
            Logger.getLogger(ItensVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected ItensVenda preencheObjeto(ResultSet resultado) {
        try {
            ItensVenda tmp = new ItensVenda();
            tmp.setId(resultado.getInt(1));
            tmp.setVenda(resultado.getInt(2));
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
    protected void preencheConsulta(PreparedStatement sql, ItensVenda obj) {
        try {
            sql.setInt(1, obj.getVenda());
            sql.setInt(2, obj.getProduto());
            sql.setInt(3, obj.getQtd());
            sql.setDouble(4, obj.getValor());
            if(obj.getId() > 0) 
                sql.setInt(5, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(ItensVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    @Override
    public boolean ExcluirItens(int idvenda) {
        try {
            PreparedStatement sql = conn.prepareStatement("DELETE FROM itensVenda WHERE fk_venda = ?");
            sql.setInt(1, idvenda);
            sql.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex + "Dg Excluir");
        }
        return false;
    }

}
