/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author breno
 */
public class FuncionarioDAO {
    Connection conn;
    public FuncionarioDAO() throws ClassNotFoundException, SQLException{
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
    public void preencherObjeto(Funcionario obj,PreparedStatement sql) throws SQLException{
        sql.setString(1, obj.getNome());
        sql.setString(2, obj.getCpf());
        sql.setString(3, obj.getIdade());
        sql.setString(4, obj.getTelefone());
        sql.setString(5, obj.getEmail());
        sql.setString(6, obj.getUF());
        sql.setString(7, obj.getCidade());
        sql.setString(8, obj.getBairro());
        sql.setString(9, obj.getRua());
        sql.setString(10, obj.getnResidencia());
    }
    public void Salvar(Funcionario obj, int id) throws SQLException{
        PreparedStatement sql;
        if(obj.getId()==0){
            sql = conn.prepareStatement("INSERT INTO funcionario(nome,cpf,dataNascimento,telefone,email,uf,cidade,bairro,rua,numResidencia)+"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            preencherObjeto(obj,sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE funcionario SET nome = ?,cpf = ?,dataNascimento = ?,telefone = ?,email= ?,uf = ?,cidade = ?,bairro = ?,rua = ?,numResidencia = ? WHERE id = ?");
            preencherObjeto(obj,sql);
            sql.setInt(11, id);
            sql.executeUpdate();
        }
    }
}
