/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Evento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author breno
 */
public class EventoDAO {
    Connection conn;
    public EventoDAO() throws ClassNotFoundException, SQLException{
        try{
         Conexao.iniciar();
         conn = Conexao.criarConexao();
        } catch(ClassNotFoundException ex){
           System.out.println("Driver não encontrado!");
        }
        catch (SQLException ex){
           System.out.println("Usuário/Senha incorrentos");
        }
    }
    public void preencherObjeto(Evento obj, PreparedStatement sql) throws SQLException{
        sql.setString(1, obj.getDescricao());
        sql.setDate(2, (Date) obj.getInicio());
        sql.setDate(3, (Date) obj.getTermino());
        sql.setDouble(4, obj.getValor());
        sql.setString(5, obj.getStatus());
    }
    public void Salvar(Evento obj, int id) throws SQLException{
        PreparedStatement sql;
        if(obj.getId() == 0){
            sql = conn.prepareStatement("INSERT INTO evento(descricao, inicio, fim, valor, statusEvento)VALUES(?,?,?,?,?)");
            preencherObjeto(obj, sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE evento SET descricao = ?, inicio = ?, fim = ?, valor = ?, statusEvento = ? WHERE id = ?");
            preencherObjeto(obj, sql);
            sql.setInt(6, id);
            sql.executeUpdate();
        }
    }
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql;
        sql = conn.prepareStatement("DELETE FROM evento WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }   
}
