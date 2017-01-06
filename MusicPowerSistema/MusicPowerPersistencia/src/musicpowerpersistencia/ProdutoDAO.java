/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Fornecedor;
import br.edu.ifnmg.MusicPower.Entidades.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marcos
 */
public class ProdutoDAO {
     Connection conn;
    public ProdutoDAO() throws SQLException{
        try {
            Conexao.iniciar();
            conn = Conexao.criarConexao();
        }  catch (ClassNotFoundException ex){
           System.out.println("Driver não encontrado!");
        } catch (SQLException ex){
           System.out.println("Usuário/Senha incorrentos");
        }
    }
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
    public void preencherConsulta(Produto obj,PreparedStatement sql) throws SQLException{
        try{
            sql.setString(1, obj.getDescricao());
            sql.setInt(2, obj.getQtd());
            sql.setDouble(3, obj.getValor());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    } 
     public void Salvar(Produto obj, int id) throws SQLException{
         PreparedStatement sql;
        if(obj.getId() == 0){
            sql = conn.prepareStatement("INSERT INTO produto(descricao,qtd,valor)VALUES(?,?,?)");
            preencherConsulta(obj, sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE produto SET descricao = ?,qtd = ?, WHERE id = ?");
            preencherConsulta(obj, sql);
            sql.setInt(3, id);
            sql.executeUpdate();
        }
    } 
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM produto WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }  
}