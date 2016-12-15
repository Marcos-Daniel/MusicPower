/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author breno
 */
public class ClienteDAO {
    Connection conn;
    
    public ClienteDAO(){
        try {
            Conexao.iniciar();
            conn = Conexao.criarConexao();
        }  catch (ClassNotFoundException ex){
           System.out.println("Driver não encontrado!");
        } catch (SQLException ex){
           System.out.println("Usuário/Senha incorrentos");
        }
    }
    
    public void preencherObjeto(Cliente obj,PreparedStatement sql) throws SQLException{
        sql.setString(1, obj.getNome());
        sql.setString(2, obj.getCpf());
        sql.setString(3, obj.getTelefone());
        sql.setString(4, obj.getEmail());
        sql.setString(5, obj.getUF());
        sql.setString(6, obj.getCidade());
        sql.setString(7, obj.getBairro());
        sql.setString(8, obj.getRua());
        sql.setString(9, obj.getnResidencia());
    }
    public void Salvar(Cliente obj, int id) throws SQLException{
       PreparedStatement sql;
        if(obj.getId() == 0){
            sql = conn.prepareStatement("INSERT INTO cliente(nome,cpf,telefone,email,uf,cidade,bairro,rua,numResidencia)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)");
            preencherObjeto(obj, sql);
            sql.executeUpdate();
       }
       else{
           sql = conn.prepareStatement("UPDATE cliente SET nome = ?,cpf = ?,telefone = ?,email = ?,uf = ?,cidade = ?,bairro = ?,rua = ?,numResidencia = ? WHERE id = ?");
           preencherObjeto(obj,sql);
           sql.setInt(10, id);
           sql.executeUpdate();
       }
    }
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM cliente WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }
 }  
