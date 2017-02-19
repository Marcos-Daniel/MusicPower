/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Cliente;
import br.edu.ifnmg.MusicPower.Entidades.ClienteRepositorio;
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
public class ClienteDAO extends DAOGenerica<Cliente> implements ClienteRepositorio {
    public ClienteDAO(){
       setConsultaSalvar("INSERT INTO cliente(nome,cpf,dataNascimento,telefone,email,cidade,uf,rua,bairro,numResidencia)VALUES(?,?,?,?,?,?,?,?,?,?)");
       setConsultaAlterar("UPDATE cliente SET nome = ?,cpf = ?,dataNascimento = ?,telefone = ?,email = ?,cidade = ?,uf = ?,rua = ?,bairro = ?,numResidencia = ? WHERE id = ?");
       setConsultaExcluir("DELETE FROM cliente WHERE id = ?");
       setConsultaAbrir("SELECT id, nome,cpf,dataNascimento,telefone,email,cidade,uf,rua,bairro,numResidencia FROM cliente");
        setConsultaBusca("SELECT id, nome,cpf,dataNascimento,telefone,email,cidade,uf,rua,bairro,numResidencia FROM cliente");
    } 
    
    @Override
    protected void preencheConsulta(PreparedStatement sql, Cliente obj) {
         try{
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getCpf());
            sql.setDate(3, (Date) obj.getDataNascimento());
            sql.setString(4, obj.getTelefone());
            sql.setString(5, obj.getEmail());
            sql.setString(6, obj.getCidade());
            sql.setString(7, obj.getUF());
            sql.setString(8, obj.getRua());
            sql.setString(9, obj.getBairro());
            sql.setString(10, obj.getnResidencia());
            if(obj.getId() > 0) sql.setInt(11,obj.getId());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }
 
   @Override
    public Cliente Abrir(String cpf) throws SQLException {
        try {
            PreparedStatement sql = conn.prepareStatement("select id,nome,cpf,dataNascimento from clientes where cpf = ?");
            sql.setString(1, cpf);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()){   
                return preencheObjeto(resultado);
            }            
        }  catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    
    @Override
    protected void preencheFiltros(Cliente filtro) {
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
        if(filtro.getCpf() != null) adicionarFiltro("cpf", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Cliente filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome()); cont++; }
            if(filtro.getCpf() != null){ sql.setString(cont, filtro.getCpf()); cont++; }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected Cliente preencheObjeto(ResultSet resultado) {
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
    
 }  
