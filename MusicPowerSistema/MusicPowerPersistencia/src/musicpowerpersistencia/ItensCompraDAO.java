/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Compra;
import br.edu.ifnmg.MusicPower.Entidades.ItensCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author marcos
 */
public class ItensCompraDAO {
    Connection conn;
    public ItensCompraDAO() throws SQLException{
        try {
            Conexao.iniciar();
            conn = Conexao.criarConexao();
        }  catch (ClassNotFoundException ex){
           System.out.println("Driver não encontrado!");
        } catch (SQLException ex){
           System.out.println("Usuário/Senha incorrentos");
        }
    }
    public void preencherConsulta(ItensCompra obj,PreparedStatement sql) throws SQLException{
        sql.setInt(1, obj.getCompra());
        sql.setInt(2, obj.getProduto());
        sql.setDouble(3, obj.getValor());
    }
    public void Salvar(ItensCompra obj, int id) throws SQLException{
         PreparedStatement sql;
        if(obj.getCompra()== 0 || obj.getCompra()== 0){
            sql = conn.prepareStatement("INSERT INTO itenscompra (compra, produto, valor)VALUES(?,?,?)");
            preencherConsulta(obj, sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE itenscompra SET compra = ?, produto = ?, valor =?, WHERE datacompra = ?");
            preencherConsulta(obj, sql);
            sql.setInt(4, id);
            sql.executeUpdate();
        }
    }
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM itenscompra WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }
}
