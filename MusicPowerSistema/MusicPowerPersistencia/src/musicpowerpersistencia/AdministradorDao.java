/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Administrador;
import br.edu.ifnmg.MusicPower.Entidades.AdministradorRepositorio;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author Mdan
 */
public class AdministradorDao extends DAOGenerica<Administrador> implements AdministradorRepositorio{
    
    public AdministradorDao() throws ClassNotFoundException, SQLException{
        setConsultaSalvar("INSERT INTO administrador(nome,cpf,dataNascimento,telefone,email,cidade,uf,rua,bairro,numResidencia,cargo,login,senha)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        setConsultaAlterar("UPDATE administrador SET nome = ?,cpf = ?,dataNascimento = ?,telefone = ?,email= ?,cidade = ?,uf = ?,rua = ?,bairro = ?,numResidencia = ? ,cargo = ?, login = ?, senha = ? WHERE id = ?");
        setConsultaExcluir("DELETE FROM administrador WHERE id = ?");
        setConsultaAbrir("SELECT id,nome,cpf,dataNascimento,telefone,email,cidade,uf,rua,bairro,numResidencia,cargo,login,senha FROM administrador");
        setConsultaBusca("SELECT id,nome,cpf,dataNascimento,telefone,email,cidade,uf,rua,bairro,numResidencia,cargo FROM administrador");
    }
    
    @Override
    protected Administrador preencheObjeto(ResultSet resultado) {
        try{
            Administrador tmp = new Administrador();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setCpf(resultado.getString(3));
            tmp.setDataNascimento(resultado.getDate(4));
            tmp.setTelefone(resultado.getString(5));
            tmp.setEmail(resultado.getString(6));
            tmp.setCidade(resultado.getString(7));
            tmp.setUF(resultado.getString(8));
            tmp.setRua(resultado.getString(10));
            tmp.setBairro(resultado.getString(9));
            tmp.setnResidencia(resultado.getString(11));
            tmp.setCargo(resultado.getString(12));
            tmp.setLogin(resultado.getString(13));
            tmp.setSenha(resultado.getString(14));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Administrador obj) {
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
            sql.setString(11, obj.getCargo());
            sql.setString(12, obj.getLogin());
            sql.setString(13, obj.getSenha());
            if(obj.getId() > 0) sql.setInt(14,obj.getId());
        } catch(SQLException ex){
            System.out.println(ex);
        }
    }

    @Override
    protected void preencheFiltros(Administrador filtro) {
       if(filtro.getNome() != null) 
            adicionarFiltro("nome", "like ");
        if(filtro.getCpf() != null) 
            adicionarFiltro("cpf", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Administrador filtro) {
         try {
            
            int cont = 1;
            if(filtro.getNome() != null ){ 
                sql.setString(cont, filtro.getNome()); 
                cont++; 
            }
            if(filtro.getCpf() != null){ 
                sql.setString(cont, filtro.getCpf()); 
                cont++; 
            }
                 
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public Administrador Abrir(String cpf) {
        try{
          PreparedStatement sql = conn.prepareStatement("SELECT id,nome,cpf,dataNascimento,telefone,email,uf,cidade,bairro,rua,numResidencia,cargo,login,senha FROM Administrador WHERE cpf = ?");
          sql.setString(1, cpf);
          ResultSet resultado = sql.executeQuery();
          if(resultado.next()) return preencheObjeto(resultado);
        } catch (SQLException ex){
            System.out.println(ex+"Abrir");
        }
        return null;
    }
    
}
