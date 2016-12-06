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
public class Filial {
    private int id;
    private String UF;
    private String cidade;
    private String bairro;
    private String rua;
    private String nEstabelecimento;

    public Filial() {
    }

    public Filial(int id, String UF, String cidade, String bairro, String rua, String nEstabelecimento) {
        this.id = id;
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
