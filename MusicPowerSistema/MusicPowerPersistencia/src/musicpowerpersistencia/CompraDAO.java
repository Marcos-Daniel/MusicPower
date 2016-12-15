/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Compra;
import br.edu.ifnmg.MusicPower.Entidades.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
    public void preencherObjeto(Compra obj,PreparedStatement sql) throws SQLException{
        sql.setInt(1, obj.getFornecedor());
        sql.setDouble(2, obj.getValor());
        sql.setDate(3, obj.getDataCompra());
    }
    
     public void Salvar(Compra obj, int id) throws SQLException{
         PreparedStatement sql;
        if(obj.getId() == 0){
            sql = conn.prepareStatement("INSERT INTO compra (fornecedor,valor,datacompra)VALUES(?,?,?)");
            preencherObjeto(obj, sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE compra SET fornecedor = ?,valor = ?, WHERE datacompra = ?");
            preencherObjeto(obj, sql);
            sql.setInt(3, id);
            sql.executeUpdate();
        }
    }
     
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM compra WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }
    
}
