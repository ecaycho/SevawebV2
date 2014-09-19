package com.crm.sevaweb.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vendedor")
public class Vendedor implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
    @Column(name = "estado")
    private String estado;
    
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @OneToMany(mappedBy = "vendedor", fetch = FetchType.LAZY)
    private List<ProspectoVenta> prospectoVenta;

    public List<ProspectoVenta> getProspectoVenta() {
        return prospectoVenta;
    }

    public void setProspectoVenta(List<ProspectoVenta> prospectoVenta) {
        this.prospectoVenta = prospectoVenta;
    }
    
    
    
}
