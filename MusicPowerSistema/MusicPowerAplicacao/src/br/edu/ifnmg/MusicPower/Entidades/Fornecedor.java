/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Entidades;

import java.util.Objects;

/**
 *
 * @author marcos
 */
public class Fornecedor implements Entidade {
    private int id = 0;
    private String nome;
    private String cnpj;
    private String telefone;
    private String email;
    private String UF;
    private String cidade;
    private String bairro;
    private String rua;
    private String nEstabelecimento;
    public Fornecedor() {
        
    }
    public Fornecedor(int id, String nome, String cnpj, String telefone, String email, String UF, String cidade, String bairro, String rua, String nEstabelecimento) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.UF = UF;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.nEstabelecimento = nEstabelecimento;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws ErroValidacao {
        if(nome.length() > 30)
           throw new ErroValidacao("O atributo NOME deve ter no máximo 30 caracteres!");
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) throws ErroValidacao {
        if(cnpj.length() > 40)
           throw new ErroValidacao("O atributo CNPJ deve ter no máximo 40 caracteres!");
        this.cnpj = cnpj;
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
        if(email.length() > 40)
           throw new ErroValidacao("O atributo EMAIL deve ter no máximo 40 caracteres!");
        this.email = email;
    }
    public String getUF() {
        return UF;
    }
    public void setUF(String UF) throws ErroValidacao{
        if(UF.length() > 3)
           throw new ErroValidacao("O atributo UF deve ter no máximo 3 caracteres!");
        this.UF = UF;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) throws ErroValidacao{
        if(cidade.length() > 20)
           throw new ErroValidacao("O atributo CIDADE deve ter no máximo 20 caracteres!");
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) throws ErroValidacao{
        if(bairro.length() > 20)
            throw new ErroValidacao("O atributo BAIRRO deve ter no máximo 20 caracteres!");
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) throws ErroValidacao{
        if(rua.length() > 30)
           throw new ErroValidacao("O atributo RUA deve ter no máximo 30 caracteres!");
        this.rua = rua;
    }
    public String getnEstabelecimento() {
        return nEstabelecimento;
    }
    public void setnEstabelecimento(String nEstabelecimento) throws ErroValidacao{
        if(nEstabelecimento.length() > 5)
            throw new ErroValidacao("O atributo NºESTABELECIMENTO deve ter no máximo 5 caracteres!");
        this.nEstabelecimento = nEstabelecimento;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.cnpj);
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
        final Fornecedor other = (Fornecedor) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Fornecedor{" + "id=" + id + ", cnpj=" + cnpj + '}';
    }
}
