/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Serviço;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author breno
 */
public class ServicoDAO {
    Connection conn;
    public ServicoDAO() throws ClassNotFoundException, SQLException{
        try{
            Conexao.iniciar();
            conn = Conexao.criarConexao();
        }catch(ClassNotFoundException ex){
           System.out.println("Driver não encontrado!");
        }
        catch (SQLException ex){
           System.out.println("Usuário/Senha incorrentos");
        }
    }
    public void preencherObjeto(Serviço obj, PreparedStatement sql) throws SQLException{
         sql.setString(1, obj.getDescricao());
        sql.setDate(2, (Date) obj.getSolicitacao());
        sql.setDate(3, (Date) obj.getEntrega());
        sql.setDouble(4, obj.getValor());
        sql.setString(5, obj.getStatusPagamanto());
        sql.setString(6, obj.getStatusProgresso());
    }
    public void Salvar(Serviço obj, int id) throws SQLException{
        PreparedStatement sql;
        if(obj.getId()==0){
            sql = conn.prepareStatement("INSERT INTO (descricao, dataSolicitacao, dataEntrega, valor, statusPagamento, statusProgresso)+"
                    + "VALUES(?,?,?,?,?,?)");
            preencherObjeto(obj,sql);
            sql.executeUpdate();
        }
        else{
            sql = conn.prepareStatement("UPDATE servico SET descricao = ?, dataSolicitacao = ?, dataEntrega = ?, valor = ?, statusPagamento = ?, statusProgresso = ? WHERE id = ?");
            preencherObjeto(obj, sql);
            sql.setInt(7, id);
            sql.executeUpdate();
        }
    }
    public void Excluir(int id) throws SQLException{
        PreparedStatement sql = conn.prepareStatement("DELETE FROM servico WHERE id = ?");
        sql.setInt(1, id);
        sql.executeUpdate();
    }
}
