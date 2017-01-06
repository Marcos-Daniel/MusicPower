/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marcos
 */
public class VendaDAO {
      Connection conn;
    public VendaDAO() throws SQLException{
        try {
            Conexao.iniciar();
            conn = Conexao.criarConexao();
        }  catch (ClassNotFoundException ex){
           System.out.println("Driver não encontrado!");
        } catch (SQLException ex){
           System.out.println("Usuário/Senha incorrentos");
        }
    }
    public Venda preencherObjeto(ResultSet resultado) throws SQLException{
        try{
            Venda tmp = new Venda();
            tmp.setId(resultado.getInt(1));
            tmp.setCliente(resultado.getInt(2));
            tmp.setValor(resultado.getDouble(3));
            tmp.setDataVenda(resultado.getDate(4));
            return tmp;
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    public void preencherConsulta(Venda obj,PreparedStatement sql) throws SQLException{
        try{
            sql.setInt(1, obj.getCliente());
            sql.setDouble(2, obj.getValor());
            sql.setDate(3, obj.getDataVenda());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
     public void Salvar(Venda obj, int id) throws SQLException{
         PreparedStatement sql;
        if(obj.getId() == 0){
            sql = conn.prepareStatement("INSERT INTO venda (cliente,valor,datavenda)VALUES(?,?,?)");
            preencherConsulta(obj, sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE venda SET cliente = ?, valor = ?, datavenda = ?, WHERE datacompra = ?");
            preencherConsulta(obj, sql);
            sql.setInt(4, id);
            sql.executeUpdate();
        }
    } 
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM venda WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }   
}
