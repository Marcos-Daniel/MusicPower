/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Entidades;

/**
 *
 * @author breno
 */
public class ItensVenda implements Entidade {
    private int id;
    private int venda;
    private int produto;
    private int qtd;
    private Double valor;
    public ItensVenda() {
        
    }
    public ItensVenda(int id, int venda, int produto, int qtd, Double valor) {
        this.id = id;
        this.venda = venda;
        this.produto = produto;
        this.qtd = qtd;
        this.valor = valor;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    public int getVenda() {
        return venda;
    }
    public void setVenda(int venda) {
        this.venda = venda;
    }
    public int getProduto() {
        return produto;
    }
    public void setProduto(int produto) {
        this.produto = produto;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.venda;
        hash = 59 * hash + this.produto;
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
        final ItensVenda other = (ItensVenda) obj;
        if (this.venda != other.venda) {
            return false;
        }
        if (this.produto != other.produto) {
            return false;
        }
        return true;
    }
}
