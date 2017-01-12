/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Serviço;
import br.edu.ifnmg.MusicPower.Entidades.ServiçoRepositorio;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breno
 */
public class ServicoDAO extends DAOGenerica<Serviço> implements ServiçoRepositorio {
    public ServicoDAO() throws ClassNotFoundException, SQLException{
        setConsultaSalvar("INSERT INTO (descricao, dataSolicitacao, dataEntrega, valor, statusPagamento, statusProgresso)VALUES(?,?,?,?,?,?)");
        setConsultaAlterar("UPDATE servico SET descricao = ?, dataSolicitacao = ?, dataEntrega = ?, valor = ?, statusPagamento = ?, statusProgresso = ? WHERE id = ?");
        setConsultaExcluir("DELETE FROM servico WHERE id = ?");
        setConsultaAbrir("SELECT id,descricao, dataSolicitacao, dataEntrega, valor, statusPagamento, statusProgresso FROM servivo WHERE id = ?");
    }
    @Override
    public Serviço preencherObjeto(ResultSet resultado) throws SQLException{
        try {
            Serviço tmp= new Serviço();
            tmp.setId(resultado.getInt(1));
            tmp.setDescricao(resultado.getString(2));
            tmp.setSolicitacao(resultado.getDate(3));
            tmp.setEntrega(resultado.getDate(4));
            tmp.setValor(resultado.getDouble(5));
            tmp.setStatusPagamanto(resultado.getString(6));
            tmp.setStatusProgresso(resultado.getString(7));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    @Override
    public void preencherConsulta(Serviço obj, PreparedStatement sql) throws SQLException{
        try {
            sql.setString(1, obj.getDescricao());
            sql.setDate(2, (Date) obj.getSolicitacao());
            sql.setDate(3, (Date) obj.getEntrega());
            sql.setDouble(4, obj.getValor());
            sql.setString(5, obj.getStatusPagamanto());
            sql.setString(6, obj.getStatusProgresso());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
    @Override
    public Serviço Abrir(String descricao) throws SQLException{
        try {
            PreparedStatement sql = conn.prepareStatement("SELECT id,descricao, dataSolicitacao, dataEntrega, valor, statusPagamento, statusProgresso FROM servivo WHERE id = ?");
            sql.setString(1, descricao);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()) return preencherObjeto(resultado);
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    protected void preencheFiltros(Serviço filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Serviço filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
