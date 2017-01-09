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
public class ItensCompra implements Entidade {
    private int id;
    private int compra;
    private int produto;
    private Double valor;
    public ItensCompra() {
        
    }
    public ItensCompra(int id, int compra, int produto, Double valor) {
        this.id = id;
        this.compra = compra;
        this.produto = produto;
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
    public int getCompra() {
        return compra;
    }
    public void setCompra(int compra) {
        this.compra = compra;
    }
    public int getProduto() {
        return produto;
    }
    public void setProduto(int produto) {
        this.produto = produto;
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
        hash = 23 * hash + this.compra;
        hash = 23 * hash + this.produto;
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
        final ItensCompra other = (ItensCompra) obj;
        if (this.compra != other.compra) {
            return false;
        }
        if (this.produto != other.produto) {
            return false;
        }
        return true;
    }    
}
