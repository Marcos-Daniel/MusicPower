/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Entidades;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author breno
 */
public class Conta implements Entidade {

    private int id;
    private String descricao;
    private Double valor;
    private String mesReferente;
    private Date vencimento;
    private String status;

    public Conta() {

    }

    public Conta(int id, String descricao, Double valor, String mesReferente, Date vencimento, String status) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.mesReferente = mesReferente;
        this.vencimento = vencimento;
        this.status = status;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws ErroValidacao {
        if(descricao.length() > 30)
            throw new ErroValidacao("O atributo DESCRIÇÃO deve ter no máximo 30 caracteres!");
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getMesReferente() {
        return mesReferente;
    }

    public void setMesReferente(String mesReferente) throws ErroValidacao {
        if(mesReferente.length() > 2)
            throw new ErroValidacao("O atributo MÊS REFERENTE deve ter no máximo 2 caracteres!");
        this.mesReferente = mesReferente;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) throws ErroValidacao {
        if(status.length()>30)
            throw new ErroValidacao("O atributo STATUS deve ter no máximo 30 caracteres!");
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.descricao);
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
        final Conta other = (Conta) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", descricao=" + descricao + '}';
    }
}
