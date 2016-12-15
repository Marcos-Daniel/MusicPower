/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.ItensCompra;
import br.edu.ifnmg.MusicPower.Entidades.ItensVenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author marcos
 */
public class ItensVendaDAO {
            Connection conn;
    public ItensVendaDAO() throws SQLException{
        try {
            Conexao.iniciar();
            conn = Conexao.criarConexao();
        }  catch (ClassNotFoundException ex){
           System.out.println("Driver não encontrado!");
        } catch (SQLException ex){
           System.out.println("Usuário/Senha incorrentos");
        }
    }
    
    public void preencherObjeto(ItensVenda obj,PreparedStatement sql) throws SQLException{
        sql.setInt(1, obj.getVenda());
        sql.setInt(2, obj.getProduto());
        sql.setDouble(3, obj.getValor());
    }
    
     public void Salvar(ItensVenda obj, int id) throws SQLException{
         PreparedStatement sql;
        if(obj.getVenda()== 0 || obj.getProduto()== 0){
            sql = conn.prepareStatement("INSERT INTO itensvenda (venda, produto, valor)VALUES(?,?,?)");
            preencherObjeto(obj, sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE itensvenda SET venda = ?, produto = ?, valor =?, WHERE datacompra = ?");
            preencherObjeto(obj, sql);
            sql.setInt(4, id);
            sql.executeUpdate();
        }
    }
     
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM itensvenda WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }
    
}
