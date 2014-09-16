/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.sevaweb.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author rtorres
 */
@Entity
@Table(name = "bitacora")
public class Bitacora implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "fecha_hora")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_hora;
    
    @Column(name = "fecha_registro")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_registro;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "comentario")
    private String comentario;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_prospecto")
    private ProspectoVenta prospectoVenta;
    
    @OneToMany(mappedBy = "Archivo", fetch = FetchType.LAZY)
    private List<Bitacora> bitacora;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public ProspectoVenta getProspectoVenta() {
        return prospectoVenta;
    }

    public void setProspectoVenta(ProspectoVenta prospectoVenta) {
        this.prospectoVenta = prospectoVenta;
    }

    public List<Bitacora> getBitacora() {
        return bitacora;
    }

    public void setBitacora(List<Bitacora> bitacora) {
        this.bitacora = bitacora;
    }
    
    
    
}
