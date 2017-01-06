/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public Funcionario preencherObjeto(ResultSet resultado) throws SQLException {
        try{
            Funcionario tmp = new Funcionario();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setCpf(resultado.getString(3));
            tmp.setIdade(resultado.getString(4));
            tmp.setTelefone(resultado.getString(5));
            tmp.setEmail(resultado.getString(6));
            tmp.setUF(resultado.getString(7));
            tmp.setCidade(resultado.getString(8));
            tmp.setBairro(resultado.getString(9));
            tmp.setRua(resultado.getString(10));
            tmp.setnResidencia(resultado.getString(11));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    public void preencherConsulta(Funcionario obj,PreparedStatement sql) throws SQLException{
        try{
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
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    public void Salvar(Funcionario obj, int id) throws SQLException{
        PreparedStatement sql;
        if(obj.getId()==0){
            sql = conn.prepareStatement("INSERT INTO funcionario(nome,cpf,dataNascimento,telefone,email,uf,cidade,bairro,rua,numResidencia)+"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            preencherConsulta(obj,sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE funcionario SET nome = ?,cpf = ?,dataNascimento = ?,telefone = ?,email= ?,uf = ?,cidade = ?,bairro = ?,rua = ?,numResidencia = ? WHERE id = ?");
            preencherConsulta(obj,sql);
            sql.setInt(11, id);
            sql.executeUpdate();
        }
    }
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM Funcionario WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }
    public Funcionario Abrir(String cpf) throws SQLException{
        try{
          PreparedStatement sql = conn.prepareStatement("SELECT id,nome,cpf,dataNascimento,telefone,email,uf,cidade,bairro,rua,numResidencia FROM Funcionario WHERE cpf = ?");
          sql.setString(1, cpf);
          ResultSet resultado = sql.executeQuery();
          if(resultado.next()) return preencherObjeto(resultado);
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
}
