/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Filial;
import br.edu.ifnmg.MusicPower.Entidades.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
    public void preencherObjeto(Fornecedor obj,PreparedStatement sql) throws SQLException{
        sql.setString(1, obj.getNome());
        sql.setString(2, obj.getCnpj());
        sql.setString(3, obj.getTelefone());
        sql.setString(4, obj.getEmail());
        sql.setString(5, obj.getUF());
        sql.setString(6, obj.getCidade());
        sql.setString(7, obj.getnEstabelecimento());
    }
    
     public void Salvar(Fornecedor obj, int id) throws SQLException{
         PreparedStatement sql;
        if(obj.getId() == 0){
            sql = conn.prepareStatement("INSERT INTO fornecedor(nome,cnpj,telefone,email,uf,cidade,nestabelecimento)VALUES(?,?,?,?,?,?,?)");
            preencherObjeto(obj, sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE fornecedor SET nome = ?,cnpj = ?,telefone = ?,email = ?,uf = ?, cidade = ? nestabelecimento = ?, WHERE id = ?");
            preencherObjeto(obj, sql);
            sql.setInt(8, id);
            sql.executeUpdate();
        }
    }
     
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM fornecedor WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }
     
}
