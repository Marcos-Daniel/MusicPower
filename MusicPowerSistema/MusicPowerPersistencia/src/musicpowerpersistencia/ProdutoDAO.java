/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Produto;
import br.edu.ifnmg.MusicPower.Entidades.ProdutoRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcos
 */
public class ProdutoDAO extends DAOGenerica<Produto> implements ProdutoRepositorio {
    public ProdutoDAO() throws SQLException{
       setConsultaSalvar("INSERT INTO produto(descricao,qtd,valor)VALUES(?,?,?)");
       setConsultaAlterar("UPDATE produto SET descricao = ?,qtd = ?, WHERE id = ?");
       setConsultaExcluir("DELETE FROM produto WHERE id = ?");
       setConsultaAbrir("SELECT id,descricao,qtd,valor FROM produto WHERE id = ?");
    }
    @Override
    public Produto preencherObjeto(ResultSet resultado) throws SQLException{
      try {
            Produto tmp = new Produto();
            tmp.setId(resultado.getInt(1));
            tmp.setDescricao(resultado.getString(2));
            tmp.setQtd(resultado.getInt(3));
            tmp.setValor(resultado.getDouble(4));
            return tmp;
      } catch(SQLException ex){
          System.out.println(ex);
      }
      return null;
    }
    @Override
    public void preencherConsulta(Produto obj,PreparedStatement sql) throws SQLException{
        try{
            sql.setString(1, obj.getDescricao());
            sql.setInt(2, obj.getQtd());
            sql.setDouble(3, obj.getValor());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }   
    @Override
    public Produto Abrir(String descricao) throws SQLException{
        try {
            PreparedStatement sql = conn.prepareStatement("SELECT id,descricao,qtd,valor FROM produto WHERE descricao = ?");
            sql.setString(1, descricao);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()) return preencherObjeto(resultado);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheFiltros(Produto filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getDescricao()!= null) adicionarFiltro("descricao", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Produto filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getDescricao()!= null ){ sql.setString(cont, filtro.getDescricao()); cont++; }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
