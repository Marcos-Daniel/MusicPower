/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marcos
 */
public class FornecedorDAO {
    Connection conn;
    public FornecedorDAO() throws SQLException{
        try {
            Conexao.iniciar();
            conn = Conexao.criarConexao();
        }  catch (ClassNotFoundException ex){
           System.out.println("Driver não encontrado!");
        } catch (SQLException ex){
           System.out.println("Usuário/Senha incorrentos");
        }
    }
    public Fornecedor preencherObjeto(ResultSet resultado) throws SQLException{
        try {
            Fornecedor tmp = new Fornecedor();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setCnpj(resultado.getString(3));
            tmp.setTelefone(resultado.getString(4));
            tmp.setEmail(resultado.getString(5));
            tmp.setUF(resultado.getString(6));
            tmp.setCidade(resultado.getString(7));
            tmp.setnEstabelecimento(resultado.getString(8));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    public void preencherConsulta(Fornecedor obj,PreparedStatement sql) throws SQLException{
        try {
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getCnpj());
            sql.setString(3, obj.getTelefone());
            sql.setString(4, obj.getEmail());
            sql.setString(5, obj.getUF());
            sql.setString(6, obj.getCidade());
            sql.setString(7, obj.getnEstabelecimento());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
     public void Salvar(Fornecedor obj, int id) throws SQLException{
         PreparedStatement sql;
        if(obj.getId() == 0){
            sql = conn.prepareStatement("INSERT INTO fornecedor(nome,cnpj,telefone,email,uf,cidade,nestabelecimento)VALUES(?,?,?,?,?,?,?)");
            preencherConsulta(obj, sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE fornecedor SET nome = ?,cnpj = ?,telefone = ?,email = ?,uf = ?, cidade = ? nestabelecimento = ?, WHERE id = ?");
            preencherConsulta(obj, sql);
            sql.setInt(8, id);
            sql.executeUpdate();
        }
    }    
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM fornecedor WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }
    public Fornecedor Abrir(String nome){
        try {
            PreparedStatement sql = conn.prepareStatement("SELECT id,nome,cnpj,telefone,email,uf,cidade,nestabelecimento FROM Fornecedor WHERE nome = ?");
            sql.setString(1, nome);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()) return preencherObjeto(resultado);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
}
