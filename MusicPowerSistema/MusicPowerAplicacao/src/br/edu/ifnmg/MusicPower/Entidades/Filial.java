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
public class Filial implements Entidade {

    private int id;
    private String UF;
    private String cidade;
    private String bairro;
    private String rua;
    private String nEstabelecimento;

    public Filial() {

    }

    public Filial(int id, String UF, String cidade, String bairro, String rua, String nEstabelecimento) {
        this.id = 0;
        this.UF = UF;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.nEstabelecimento = nEstabelecimento;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
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

    public void setCidade(String cidade)  throws ErroValidacao {
        if(cidade.length() > 20)
            throw new ErroValidacao("O atributo CIDADE deve ter no máximo 20 caracteres!");
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro)  throws ErroValidacao {
        if(bairro.length() > 20)
            throw new ErroValidacao("O atributo BAIRRO deve ter no máximo 20 caracteres!");
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua)  throws ErroValidacao {
        if(rua.length() > 30)
            throw new ErroValidacao("O atributo RUA deve ter no máximo 30 caracteres!");
        this.rua = rua;
    }

    public String getnEstabelecimento() {
        return nEstabelecimento;
    }

    public void setnEstabelecimento(String nEstabelecimento)  throws ErroValidacao {
        if(nEstabelecimento.length() > 5)
            throw new ErroValidacao("O atributo NºEstabelecimento deve ter no máximo 5 caracteres!");
        this.nEstabelecimento = nEstabelecimento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.UF);
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
        final Filial other = (Filial) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.UF, other.UF)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Filial{" + "id=" + id + ", UF=" + UF + '}';
    }
}
