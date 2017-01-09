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
    private int id;
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
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUF() {
        return UF;
    }
    public void setUF(String UF) {
        this.UF = UF;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getnEstabelecimento() {
        return nEstabelecimento;
    }
    public void setnEstabelecimento(String nEstabelecimento) {
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
