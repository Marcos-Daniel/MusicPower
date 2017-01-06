/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marcos
 */
public class CompraDAO {
    Connection conn;
    public CompraDAO() throws SQLException{
        try {
           Conexao.iniciar();
           conn = Conexao.criarConexao();
        }  catch (ClassNotFoundException ex){
           System.out.println("Driver não encontrado!");
        } catch (SQLException ex){
           System.out.println("Usuário/Senha incorrentos");
        }
    }
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
    public void preencherConsulta(Compra obj,PreparedStatement sql) throws SQLException{
        try{
            sql.setInt(1, obj.getFornecedor());
            sql.setDouble(2, obj.getValor());
            sql.setDate(3, obj.getDataCompra());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    public void Salvar(Compra obj, int id) throws SQLException{
         PreparedStatement sql;
        if(obj.getId() == 0){
            sql = conn.prepareStatement("INSERT INTO compra (fornecedor,valor,datacompra)VALUES(?,?,?)");
            preencherConsulta(obj, sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE compra SET fornecedor = ?,valor = ?, WHERE datacompra = ?");
            preencherConsulta(obj, sql);
            sql.setInt(3, id);
            sql.executeUpdate();
        }
    } 
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM compra WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }
    public Compra Abrir(int id) throws SQLException{
        try{
           PreparedStatement sql = conn.prepareStatement("SELECT id,fornecedor,valor,datacompra FROM Compra WHERE id = ?");
           sql.setInt(1, id);
           ResultSet resultado = sql.executeQuery();
        if(resultado.next()) return preencherObjeto(resultado);
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
}
