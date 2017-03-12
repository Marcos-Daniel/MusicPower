/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Compra;
import br.edu.ifnmg.MusicPower.Entidades.CompraRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcos
 */
public class CompraDAO extends DAOGenerica<Compra> implements CompraRepositorio {

    public CompraDAO() {
        setConsultaSalvar("INSERT INTO compra (fk_fornecedor,fk_funcionario,valor,datacompra)VALUES(?,?,?,?)");
        setConsultaAlterar("UPDATE compra SET fk_fornecedor = ?,fk_funcionario = ?,valor = ?, WHERE datacompra = ?");
        setConsultaExcluir("DELETE FROM compra WHERE id = ?");
        setConsultaAbrir("SELECT id,fk_fornecedor,fk_funcionario,valor,datacompra FROM compra WHERE id = ?");
        setConsultaBusca("SELECT id,fk_fornecedor,fk_funcionario,valor,datacompra FROM compra");
    }

    @Override
    protected void preencheFiltros(Compra filtro) {
        if (filtro.getId() > 0) {
            adicionarFiltro("id", "=");
        }
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Compra filtro) {
        try {
            int cont = 1;
            if (filtro.getId() > 0) {
                sql.setInt(cont, filtro.getId());
                cont++;
            }
            if (filtro.getFornecedor() > 0) {
                sql.setInt(cont, filtro.getFornecedor());
                cont++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected Compra preencheObjeto(ResultSet resultado) {
        try {
            Compra tmp = new Compra();
            tmp.setId(resultado.getInt(1));
            tmp.setFornecedor(resultado.getInt(2));
            tmp.setFuncionario(resultado.getInt(3));
            tmp.setValor(resultado.getDouble(4));
            tmp.setDataCompra(resultado.getDate(5));
            return tmp;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Compra obj) {
        try {
            sql.setInt(1, obj.getFornecedor());
            sql.setInt(2, obj.getFuncionario());
            sql.setDouble(3, obj.getValor());
            sql.setDate(4, obj.getDataCompra());
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public int buscarUltimoId() {
        try {
            PreparedStatement sql = conn.prepareStatement("SELECT MAX(ID) as id FROM compra");
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

    @Override
    public boolean ExcluirItens(int idcompra) {
         try {
            PreparedStatement sql = conn.prepareStatement("DELETE FROM compra WHERE id = ?");
            sql.setInt(1, idcompra);
            sql.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex + "Dg Excluir");
        }
        return false;
    }

}
