/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Conta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author breno
 */
public class ContaDAO {
    Connection conn;
    public ContaDAO(){
        try {
            Conexao.iniciar();
            conn = Conexao.criarConexao();
        }
        catch(ClassNotFoundException ex){
           System.out.println("Driver não encontrado!");
        }
        catch (SQLException ex){
           System.out.println("Usuário/Senha incorrentos");
        }
    }
    public Conta preencherObjeto(ResultSet resultado) throws SQLException{
        try {
            Conta tmp = new Conta();
            tmp.setId(resultado.getInt(1));
            tmp.setDescricao(resultado.getString(2));
            tmp.setValor(resultado.getDouble(3));
            tmp.setMesReferente(resultado.getString(4));
            tmp.setVencimento(resultado.getDate(5));
            tmp.setStatus(resultado.getString(6));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    public void preencherConsulta(Conta obj, PreparedStatement sql) throws SQLException{
        try{
            sql.setString(1, obj.getDescricao());
            sql.setDouble(2, obj.getValor());
            sql.setString(3, obj.getMesReferente());
            sql.setDate(4, (Date) obj.getVencimento());
            sql.setString(5, obj.getStatus());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    public void Salvar(Conta obj, int id) throws SQLException{
        PreparedStatement sql;
        if(obj.getId()== 0){
            sql = conn.prepareStatement("INSERT INTO conta(descricao, valor, mesReferente, vencimento,StatusConta)+"
                    + "VALUES(?,?,?,?,?)"); 
            preencherConsulta(obj, sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE conta SET descricao = ?, valor = ?, mesReferente = ?, vencimento = ?,StatusConta = ? WHERE id = ?");
            preencherConsulta(obj, sql);
            sql.setInt(6, id);
            sql.executeUpdate();
        }
    }
    public void Exluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM conta WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }
    public Conta Abrir(String mes) throws SQLException{
        try{
            PreparedStatement sql = conn.prepareStatement("SELECT id,descricao,valor,mesReferente,vencimento,StatusConta FROM WHERE mesReferente = ?");
            sql.setString(1,mes);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()) return preencherObjeto(resultado);
        } catch(SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
}
