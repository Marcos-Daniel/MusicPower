/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MusicPower.Entidades;

import java.util.List;

/**
 *
 * @author breno
 */
public interface Repositorio<T extends Entidade> {
    public boolean Salvar(T obj);
    public boolean Alterar(T obj);
    public boolean Excluir(T obj);
    public T Abrir(int id);
    public List<T> Buscar(T filtro);
}
