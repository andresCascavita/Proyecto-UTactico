/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uTactico.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANDRES CASCAVITA
 */
@Entity
@Table(name = "REPORTEINCIDENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reporteincidente.findAll", query = "SELECT r FROM Reporteincidente r"),
    @NamedQuery(name = "Reporteincidente.findById", query = "SELECT r FROM Reporteincidente r WHERE r.id = :id"),
    @NamedQuery(name = "Reporteincidente.findByTipoactorvial", query = "SELECT r FROM Reporteincidente r WHERE r.tipoactorvial = :tipoactorvial"),
    @NamedQuery(name = "Reporteincidente.findByLocalidad", query = "SELECT r FROM Reporteincidente r WHERE r.localidad = :localidad"),
    @NamedQuery(name = "Reporteincidente.findByBarrio", query = "SELECT r FROM Reporteincidente r WHERE r.barrio = :barrio"),
    @NamedQuery(name = "Reporteincidente.findByZona", query = "SELECT r FROM Reporteincidente r WHERE r.zona = :zona"),
    @NamedQuery(name = "Reporteincidente.findBySenales", query = "SELECT r FROM Reporteincidente r WHERE r.senales = :senales"),
    @NamedQuery(name = "Reporteincidente.findByTiposuelo", query = "SELECT r FROM Reporteincidente r WHERE r.tiposuelo = :tiposuelo"),
    @NamedQuery(name = "Reporteincidente.findByEquipamiento", query = "SELECT r FROM Reporteincidente r WHERE r.equipamiento = :equipamiento"),
    @NamedQuery(name = "Reporteincidente.findByTiposenal", query = "SELECT r FROM Reporteincidente r WHERE r.tiposenal = :tiposenal"),
    @NamedQuery(name = "Reporteincidente.findByFecha", query = "SELECT r FROM Reporteincidente r WHERE r.fecha = :fecha")})
public class Reporteincidente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "TIPOACTORVIAL")
    private String tipoactorvial;
    @Size(max = 255)
    @Column(name = "LOCALIDAD")
    private String localidad;
    @Size(max = 255)
    @Column(name = "BARRIO")
    private String barrio;
    @Size(max = 255)
    @Column(name = "ZONA")
    private String zona;
    @Size(max = 255)
    @Column(name = "SENALES")
    private String senales;
    @Size(max = 255)
    @Column(name = "TIPOSUELO")
    private String tiposuelo;
    @Size(max = 255)
    @Column(name = "EQUIPAMIENTO")
    private String equipamiento;
    @Size(max = 255)
    @Column(name = "TIPOSENAL")
    private String tiposenal;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Reporteincidente() {
    }

    public Reporteincidente(Integer id, String tipoactorvial, String localidad, String barrio, String zona, String senales, String tiposuelo, String equipamiento, String tiposenal, Date fecha) {
        this.id = id;
        this.tipoactorvial = tipoactorvial;
        this.localidad = localidad;
        this.barrio = barrio;
        this.zona = zona;
        this.senales = senales;
        this.tiposuelo = tiposuelo;
        this.equipamiento = equipamiento;
        this.tiposenal = tiposenal;
        this.fecha = fecha;
    }

    public Reporteincidente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoactorvial() {
        return tipoactorvial;
    }

    public void setTipoactorvial(String tipoactorvial) {
        this.tipoactorvial = tipoactorvial;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getSenales() {
        return senales;
    }

    public void setSenales(String senales) {
        this.senales = senales;
    }

    public String getTiposuelo() {
        return tiposuelo;
    }

    public void setTiposuelo(String tiposuelo) {
        this.tiposuelo = tiposuelo;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getTiposenal() {
        return tiposenal;
    }

    public void setTiposenal(String tiposenal) {
        this.tiposenal = tiposenal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reporteincidente)) {
            return false;
        }
        Reporteincidente other = (Reporteincidente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uTactico.entity.Reporteincidente[ id=" + id + " ]";
    }
    
}
