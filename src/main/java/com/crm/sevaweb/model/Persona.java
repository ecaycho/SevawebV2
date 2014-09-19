package com.crm.sevaweb.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
    
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
    @Column(name = "paterno")
    private String paterno;

    @Column(name = "materno")
    private String materno;
    
    @Column(name = "nombres")
    private String nombres;
    
    @Column(name = "sexo")
    private String sexo;
    
    @Column(name = "fecha_nacimiento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_nacimiento;
    
    @Column(name = "email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @OneToOne(mappedBy="persona", fetch= FetchType.LAZY)
    private Usuario usuario;
    
    @OneToMany(mappedBy="persona", fetch= FetchType.LAZY)
    private List<Vendedor> vendedor;    
    
   
}
