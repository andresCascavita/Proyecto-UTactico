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
@Table(name = "DECISION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Decision.findAll", query = "SELECT d FROM Decision d"),
    @NamedQuery(name = "Decision.findById", query = "SELECT d FROM Decision d WHERE d.id = :id"),
    @NamedQuery(name = "Decision.findBySenalizacion", query = "SELECT d FROM Decision d WHERE d.senalizacion = :senalizacion"),
    @NamedQuery(name = "Decision.findByDecision", query = "SELECT d FROM Decision d WHERE d.decision = :decision"),
    @NamedQuery(name = "Decision.findByFecha", query = "SELECT d FROM Decision d WHERE d.fecha = :fecha")})
public class Decision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "SENALIZACION")
    private String senalizacion;
    @Size(max = 255)
    @Column(name = "DECISION")
    private String decision;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Decision() {
    }

    public Decision(Integer id, String senalizacion, String decision, Date fecha) {
        this.id = id;
        this.senalizacion = senalizacion;
        this.decision = decision;
        this.fecha = fecha;
    }

    public Decision(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenalizacion() {
        return senalizacion;
    }

    public void setSenalizacion(String senalizacion) {
        this.senalizacion = senalizacion;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
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
        if (!(object instanceof Decision)) {
            return false;
        }
        Decision other = (Decision) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uTactico.entity.Decision[ id=" + id + " ]";
    }
    
}
