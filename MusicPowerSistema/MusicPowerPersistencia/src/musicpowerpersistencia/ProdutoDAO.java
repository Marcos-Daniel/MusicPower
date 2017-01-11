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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Produto filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
