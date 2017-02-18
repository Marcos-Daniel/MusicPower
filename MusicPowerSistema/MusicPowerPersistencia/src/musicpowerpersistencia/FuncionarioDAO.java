/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicpowerpersistencia;

import br.edu.ifnmg.MusicPower.Entidades.Funcionario;
import br.edu.ifnmg.MusicPower.Entidades.FuncionarioRepositorio;
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
public class FuncionarioDAO extends DAOGenerica<Funcionario> implements FuncionarioRepositorio {
    public FuncionarioDAO() throws ClassNotFoundException, SQLException{
        setConsultaSalvar("INSERT INTO funcionario(nome,cpf,dataNascimento,telefone,email,uf,cidade,bairro,rua,numResidencia)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        setConsultaAlterar("UPDATE funcionario SET nome = ?,cpf = ?,dataNascimento = ?,telefone = ?,email= ?,uf = ?,cidade = ?,bairro = ?,rua = ?,numResidencia = ? WHERE id = ?");
        setConsultaExcluir("DELETE FROM Funcionario WHERE id = ?");
        setConsultaAbrir("SELECT id,nome,cpf,dataNascimento,telefone,email,uf,cidade,bairro,rua,numResidencia FROM Funcionario WHERE id = ?");
    }
    
    @Override
    public Funcionario Abrir(String cpf) throws SQLException{
        try{
          PreparedStatement sql = conn.prepareStatement("SELECT id,nome,cpf,dataNascimento,telefone,email,uf,cidade,bairro,rua,numResidencia FROM Funcionario WHERE cpf = ?");
          sql.setString(1, cpf);
          ResultSet resultado = sql.executeQuery();
          if(resultado.next()) return preencheObjeto(resultado);
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheFiltros(Funcionario filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getNome() != null) adicionarFiltro("nome", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Funcionario filtro) {
        try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome()); cont++; }
                 
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected Funcionario preencheObjeto(ResultSet resultado) {
         try{
            Funcionario tmp = new Funcionario();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setCpf(resultado.getString(3));
         //   tmp.getDataNascimento((Date) resultado.getString(4));
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

    @Override
    protected void preencheConsulta(PreparedStatement sql, Funcionario obj) {
      try{
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getCpf());
         //   sql.setString(3, obj.getIdade());
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
}
