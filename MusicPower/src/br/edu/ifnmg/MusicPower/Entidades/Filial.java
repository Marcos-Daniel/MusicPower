/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Entidades;

/**
 *
 * @author marcos
 */
public class Filial {
    
    private String UF;
    private String cidade;
    private String bairro;
    private String rua;
    private String nEstabelecimento;

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
    
}
