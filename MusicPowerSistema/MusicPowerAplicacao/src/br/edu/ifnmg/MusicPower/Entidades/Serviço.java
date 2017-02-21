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
public class Serviço implements Entidade {
    private int id;
    private String descricao;
    private Date solicitacao;
    private Date entrega;
    private Double valor;
    private String statusPagamanto;
    private String statusProgresso;
    private int idCliente;
    private int idFuncionario;
    private String nomeCliente;
    private String nomeFuncionario;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    
    public Serviço() {
        
    }
    public Serviço(int id, String descricao, Date solicitacao, Date entrega, Double valor, String statusPagamanto, String statusProgresso) {
        this.id = id;
        this.descricao = descricao;
        this.solicitacao = solicitacao;
        this.entrega = entrega;
        this.valor = valor;
        this.statusPagamanto = statusPagamanto;
        this.statusProgresso = statusProgresso;
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
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getSolicitacao() {
        return solicitacao;
    }
    public void setSolicitacao(Date solicitacao) {
        this.solicitacao = solicitacao;
    }
    public Date getEntrega() {
        return entrega;
    }
    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getStatusPagamanto() {
        return statusPagamanto;
    }
    public void setStatusPagamanto(String statusPagamanto) {
        this.statusPagamanto = statusPagamanto;
    }
    public String getStatusProgresso() {
        return statusProgresso;
    }
    public void setStatusProgresso(String statusProgresso) {
        this.statusProgresso = statusProgresso;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.descricao);
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
        final Serviço other = (Serviço) obj;
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
        return "Servi\u00e7o{" + "id=" + id + ", descricao=" + descricao + '}';
    }
}
