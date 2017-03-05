/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Entidades;


import java.sql.Date;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author breno
 */
public abstract class Pessoa implements Entidade {
    private int id = 0;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String UF;
    private String cidade;
    private String bairro;
    private String rua;
    private String nResidencia;

    public Pessoa() {

    }

    public Pessoa(int id, String nome, String cpf, Date dataNascimento, String telefone, String email, String UF, String cidade, String bairro, String rua, String nResidencia) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.UF = UF;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.nResidencia = nResidencia;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws ErroValidacao {
        if(cpf.length() > 11)
            throw new ErroValidacao("O atributo CPF deve ter no máximo 11 caracteres!");
        
        CPF pf = new CPF(cpf);
        if(pf.isCPF()== true){            
           this.cpf = cpf;
        }else{
            throw new ErroValidacao("CPF Invalido!");
        }
                
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ErroValidacao {
        if(nome.length() > 50)
            throw new ErroValidacao("O atributo NOME deve ter no máximo 50 caracteres!");
        this.nome = nome;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws ErroValidacao {
        if(telefone.length() > 12)
            throw new ErroValidacao("O atributo TELEFONE deve ter no máximo 12 caracteres!");
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws ErroValidacao {
        if(email.length() > 40){
            throw new ErroValidacao("O atributo EMAIL deve ter no máximo 40 caracteres!");
        }
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(email);
        boolean matchFoud = m.matches();
        if(matchFoud){
            this.email = email;
        }else{
             throw new ErroValidacao("E-mail Invalido!!!");
        }
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) throws ErroValidacao {
        if(UF.length() > 3)
            throw new ErroValidacao("O atributo UF deve ter no máximo 3 caracteres!");
        this.UF = UF;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws ErroValidacao {
        if(cidade.length() > 20)
            throw new ErroValidacao("O atributo CIDADE deve ter no máximo 20 caracteres!");
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws ErroValidacao {
        if(bairro.length() > 20)
            throw new ErroValidacao("O atributo BAIRRO deve ter no máximo 20 caracteres!");
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws ErroValidacao {
        if(rua.length() > 30)
            throw new ErroValidacao("O atributo RUA deve ter no máximo 30 caracteres!");
        this.rua = rua;
    }

    public String getnResidencia() {
        return nResidencia;
    }

    public void setnResidencia(String nResidencia) throws ErroValidacao {
        if(nResidencia.length() > 5)
            throw new ErroValidacao("O atributo NUMERO RESIDÊNCIA deve ter no máximo 5 caracteres!");
        this.nResidencia = nResidencia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + '}';
    }
    
}
