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
       setConsultaSalvar("INSERT INTO compra (fornecedor,valor,datacompra)VALUES(?,?,?)");
       setConsultaAlterar("UPDATE compra SET fornecedor = ?,valor = ?, WHERE datacompra = ?");
       setConsultaExcluir("DELETE FROM compra WHERE id = ?");
       setConsultaAbrir("SELECT id,fornecedor,valor,datacompra FROM Compra WHERE id = ?");
    }
    @Override
    public Compra preencherObjeto(ResultSet resultado) throws SQLException{
        try{
            Compra tmp = new Compra();
            tmp.setId(resultado.getInt(1));
            tmp.setFornecedor(resultado.getInt(2));
            tmp.setValor(resultado.getDouble(3));
            tmp.setDataCompra(resultado.getDate(4));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    @Override
    public void preencherConsulta(PreparedStatement sql, Compra obj) throws SQLException{
        try{
            sql.setInt(1, obj.getFornecedor());
            sql.setDouble(2, obj.getValor());
            sql.setDate(3, obj.getDataCompra());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }

    @Override
    protected void preencheFiltros(Compra filtro) {
       if(filtro.getId()> 0) adicionarFiltro("id", "=");
       if(filtro.getFornecedor()> 0) adicionarFiltro("fornecedor", "=");    
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Compra filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getFornecedor()>0 ){ sql.setInt(cont, filtro.getFornecedor()); cont++; }
            
        } catch (SQLException ex) {
            Logger.getLogger(CompraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
