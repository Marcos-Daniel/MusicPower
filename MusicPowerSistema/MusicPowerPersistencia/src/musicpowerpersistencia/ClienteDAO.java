/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public Cliente preencherObjeto(ResultSet resultado) throws SQLException{
        try{
            Cliente tmp = new Cliente();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setCpf(resultado.getString(3));
            tmp.setTelefone(resultado.getString(4));
            tmp.setEmail(resultado.getString(5));
            tmp.setUF(resultado.getString(6));
            tmp.setCidade(resultado.getString(7));
            tmp.setBairro(resultado.getString(8));
            tmp.setRua(resultado.getString(9));
            tmp.setnResidencia(resultado.getString(10));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    public void preencherConsulta(Cliente obj,PreparedStatement sql) throws SQLException{
        try{
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getCpf());
            sql.setString(3, obj.getTelefone());
            sql.setString(4, obj.getEmail());
            sql.setString(5, obj.getUF());
            sql.setString(6, obj.getCidade());
            sql.setString(7, obj.getBairro());
            sql.setString(8, obj.getRua());
            sql.setString(9, obj.getnResidencia());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    public void Salvar(Cliente obj, int id) throws SQLException{ 
        if(obj.getId() == 0){
            PreparedStatement sql = conn.prepareStatement("INSERT INTO cliente(nome,cpf,telefone,email,uf,cidade,bairro,rua,numResidencia)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)");
            preencherConsulta(obj, sql);
            sql.executeUpdate();
       }
       else{
           PreparedStatement sql = conn.prepareStatement("UPDATE cliente SET nome = ?,cpf = ?,telefone = ?,email = ?,uf = ?,cidade = ?,bairro = ?,rua = ?,numResidencia = ? WHERE id = ?");
           preencherConsulta(obj,sql);
           sql.setInt(10, id);
           sql.executeUpdate();
       }
    }
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM cliente WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }
    public Cliente Abrir(String cpf) throws SQLException{
        try{
        PreparedStatement sql = conn.prepareStatement("SELECT id, nome,cpf,telefone,email,uf,cidade,bairro,rua,numResidencia FROM Cliente WHERE cpf = ?");
        sql.setString(1, cpf);
        ResultSet resultado = sql.executeQuery();
        if(resultado.next()) return preencherObjeto(resultado);    
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
 }  
