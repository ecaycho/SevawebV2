/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.sevaweb.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author rtorres
 */
@Entity
@Table(name = "campania")
public class Categoria implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @OneToMany(mappedBy = "prospectoVenta", fetch = FetchType.LAZY)
    private List<Categoria> categoria;
}
