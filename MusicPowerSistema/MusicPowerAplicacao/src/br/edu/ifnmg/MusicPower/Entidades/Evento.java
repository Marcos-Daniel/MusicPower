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
public class Evento implements Entidade {

    private int id;
    private String nome;
    private String descricao;
    private Date inicio;
    private Date termino;
    private Double valor;
    private String status;

    public Evento() {

    }

    public Evento(int id, String descricao, Date inicio, Date termino, Double valor, String status) {
        this.id = id = 0;
        this.descricao = descricao;
        this.inicio = inicio;
        this.termino = termino;
        this.valor = valor;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ErroValidacao {
        if (nome.length() > 30) {
            throw new ErroValidacao("O atributo NOME deve ter no máximo 30 caracteres!");
        }
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws ErroValidacao {
        if(descricao.length() > 200)
            throw new ErroValidacao("O atributo DESCRIÇÃO deve ter no máximo 200 caracteres!");
        this.descricao = descricao;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getTermino() {
        return termino;
    }

    public void setTermino(Date termino) {
        this.termino = termino;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) throws ErroValidacao {
        if(status.length() > 30)
            throw new ErroValidacao("O atributo STATUS deve ter no máximo 30 caracteres!");
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.descricao);
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
        final Evento other = (Evento) obj;
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
        return "Evento{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", inicio=" + inicio + ", termino=" + termino + ", valor=" + valor + ", status=" + status + '}';
    }

}
