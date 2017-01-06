/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Filial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author breno
 */
public class FilialDAO {
    Connection conn;
    public FilialDAO() throws SQLException{
        try {
            Conexao.iniciar();
            conn = Conexao.criarConexao();
        } catch (ClassNotFoundException ex){
           System.out.println("Driver não encontrado!");
        } catch (SQLException ex){
           System.out.println("Usuário/Senha incorrentos");
        }
    }
    public Filial preencherObjeto(ResultSet resultado) throws SQLException{
        try {
            Filial tmp = new Filial();
            tmp.setId(resultado.getInt(1));
            tmp.setUF(resultado.getString(2));
            tmp.setCidade(resultado.getString(3));
            tmp.setBairro(resultado.getString(4));
            tmp.setRua(resultado.getString(5));
            tmp.setnEstabelecimento(resultado.getString(6));
        return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    public void preencherConsulta(Filial obj,PreparedStatement sql) throws SQLException{
        try{
            sql.setString(1, obj.getUF());
            sql.setString(2, obj.getCidade());
            sql.setString(3, obj.getBairro());
            sql.setString(4, obj.getRua());
            sql.setString(5, obj.getnEstabelecimento());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    public void Salvar(Filial obj, int id) throws SQLException{
         PreparedStatement sql;
        if(obj.getId() == 0){
            sql = conn.prepareStatement("INSERT INTO filial(uf,cidade,bairro,rua,numEstabelecimento)VALUES(?,?,?,?,?)");
            preencherConsulta(obj, sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE filial SET uf = ?,cidade = ?,bairro = ?,rua = ?,numEstabelecimento = ? WHERE id = ?");
            preencherConsulta(obj, sql);
            sql.setInt(6, id);
            sql.executeUpdate();
        }
    }
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM filial WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }
    public Filial Abrir(String cidade) throws SQLException{
        try {
            PreparedStatement sql = conn.prepareStatement("SELECT id,uf,cidade,bairro,rua,numEstabelecimento FROM Filial WHERE cidade = ?");
            sql.setString(1, cidade);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()) return preencherObjeto(resultado);
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
}





