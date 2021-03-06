/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.ErroValidacao;
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
        setConsultaSalvar("INSERT INTO servico(descricao, dataSolicitacao, dataEntrega, valor, statusPagamento, statusProgresso,idcliente, idfuncionario,nomecliente,nomefuncionario)VALUES(?,?,?,?,?,?,?,?,?,?)");
        setConsultaAlterar("UPDATE servico SET descricao = ?, dataSolicitacao = ?, dataEntrega = ?, valor = ?, statusPagamento = ?, statusProgresso = ?,idcliente = ?, idfuncionario = ?,nomecliente = ?,nomefuncionario = ? WHERE id = ?");
        setConsultaExcluir("DELETE FROM servico WHERE id = ?");
        setConsultaAbrir("SELECT id,descricao, dataSolicitacao, dataEntrega, valor, statusPagamento, statusProgresso,idcliente, idfuncionario,nomecliente,nomefuncionario FROM servico");
        setConsultaBusca("SELECT id,descricao, dataSolicitacao, dataEntrega, valor, statusPagamento, statusProgresso,idcliente, idfuncionario,nomecliente,nomefuncionario FROM servico");
    }
  
    @Override
    public Serviço Abrir(String descricao) throws SQLException{
        try {
            PreparedStatement sql = conn.prepareStatement("SELECT id,descricao, dataSolicitacao, dataEntrega, valor, statusPagamento, statusProgresso FROM servivo WHERE id = ?");
            sql.setString(1, descricao);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()) return preencheObjeto(resultado);
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    protected void preencheFiltros(Serviço filtro) {
        
        if(filtro.getId() > 0) adicionarFiltro("id", "= ");
        if(filtro.getIdCliente() > 0) adicionarFiltro(" idcliente", "=");
        if(filtro.getNomeCliente() != null) adicionarFiltro(" nomecliente", "=");
        
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Serviço filtro) {
         try {
            int cont = 1;
            
            if(filtro.getId() > 0){ 
                sql.setInt(cont, filtro.getId()); 
                cont++; 
            }
            if(filtro.getIdCliente() > 0){ 
                sql.setInt(cont, filtro.getIdCliente());
                cont++;
            }
            if(filtro.getNomeCliente() != null){
                sql.setString(cont, filtro.getNomeCliente());
                cont++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected Serviço preencheObjeto(ResultSet resultado) {
         try {
            Serviço tmp= new Serviço();
            tmp.setId(resultado.getInt(1));
            tmp.setDescricao(resultado.getString(2));
            tmp.setSolicitacao(resultado.getDate(3));
            tmp.setEntrega(resultado.getDate(4));
            tmp.setValor(resultado.getDouble(5));
            tmp.setStatusPagamanto(resultado.getString(6));
            tmp.setStatusProgresso(resultado.getString(7));
            tmp.setIdCliente(resultado.getInt(8));
            tmp.setIdFuncionario(resultado.getInt(9));
            tmp.setNomeCliente(resultado.getString(10));
            tmp.setNomeFuncionario(resultado.getString(11));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        } catch (ErroValidacao ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Serviço obj) {
       try {
            sql.setString(1, obj.getDescricao());
            sql.setDate(2, (Date) obj.getSolicitacao());
            sql.setDate(3, (Date) obj.getEntrega());
            sql.setDouble(4, obj.getValor());
            sql.setString(5, obj.getStatusPagamanto());
            sql.setString(6, obj.getStatusProgresso());
            sql.setInt(7, obj.getIdCliente());
            sql.setInt(8, obj.getIdFuncionario());
            sql.setString(9, obj.getNomeCliente());
            sql.setString(10, obj.getNomeFuncionario());
            if(obj.getId() > 0)
                sql.setInt(11, obj.getId());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }

}
