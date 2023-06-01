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
@Table(name = "ESTADISTICAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadisticas.findAll", query = "SELECT e FROM Estadisticas e"),
    @NamedQuery(name = "Estadisticas.findByIde", query = "SELECT e FROM Estadisticas e WHERE e.ide = :ide"),
    @NamedQuery(name = "Estadisticas.findByMese", query = "SELECT e FROM Estadisticas e WHERE e.mese = :mese"),
    @NamedQuery(name = "Estadisticas.findByZonae", query = "SELECT e FROM Estadisticas e WHERE e.zonae = :zonae"),
    @NamedQuery(name = "Estadisticas.findByBarrioe", query = "SELECT e FROM Estadisticas e WHERE e.barrioe = :barrioe"),
    @NamedQuery(name = "Estadisticas.findByLocalidade", query = "SELECT e FROM Estadisticas e WHERE e.localidade = :localidade"),
    @NamedQuery(name = "Estadisticas.findByTipoactorinvolucradoe", query = "SELECT e FROM Estadisticas e WHERE e.tipoactorinvolucradoe = :tipoactorinvolucradoe"),
    @NamedQuery(name = "Estadisticas.findByPersonasquetransitane", query = "SELECT e FROM Estadisticas e WHERE e.personasquetransitane = :personasquetransitane"),
    @NamedQuery(name = "Estadisticas.findByNumeroaccidentese", query = "SELECT e FROM Estadisticas e WHERE e.numeroaccidentese = :numeroaccidentese"),
    @NamedQuery(name = "Estadisticas.findByHeridose", query = "SELECT e FROM Estadisticas e WHERE e.heridose = :heridose"),
    @NamedQuery(name = "Estadisticas.findByFallecidose", query = "SELECT e FROM Estadisticas e WHERE e.fallecidose = :fallecidose"),
    @NamedQuery(name = "Estadisticas.findByFechae", query = "SELECT e FROM Estadisticas e WHERE e.fechae = :fechae")})
public class Estadisticas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDE")
    private Integer ide;
    @Size(max = 255)
    @Column(name = "MESE")
    private String mese;
    @Size(max = 255)
    @Column(name = "ZONAE")
    private String zonae;
    @Size(max = 255)
    @Column(name = "BARRIOE")
    private String barrioe;
    @Size(max = 255)
    @Column(name = "LOCALIDADE")
    private String localidade;
    @Size(max = 255)
    @Column(name = "TIPOACTORINVOLUCRADOE")
    private String tipoactorinvolucradoe;
    @Size(max = 255)
    @Column(name = "PERSONASQUETRANSITANE")
    private String personasquetransitane;
    @Column(name = "NUMEROACCIDENTESE")
    private Integer numeroaccidentese;
    @Column(name = "HERIDOSE")
    private Integer heridose;
    @Column(name = "FALLECIDOSE")
    private Integer fallecidose;
    @Column(name = "FECHAE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechae;

    public Estadisticas() {
    }

    public Estadisticas(Integer ide, String mese, String zonae, String barrioe, String localidade, String tipoactorinvolucradoe, String personasquetransitane, Integer numeroaccidentese, Integer heridose, Integer fallecidose, Date fechae) {
        this.ide = ide;
        this.mese = mese;
        this.zonae = zonae;
        this.barrioe = barrioe;
        this.localidade = localidade;
        this.tipoactorinvolucradoe = tipoactorinvolucradoe;
        this.personasquetransitane = personasquetransitane;
        this.numeroaccidentese = numeroaccidentese;
        this.heridose = heridose;
        this.fallecidose = fallecidose;
        this.fechae = fechae;
    }

    public Estadisticas(Integer ide) {
        this.ide = ide;
    }

    public Integer getIde() {
        return ide;
    }

    public void setIde(Integer ide) {
        this.ide = ide;
    }

    public String getMese() {
        return mese;
    }

    public void setMese(String mese) {
        this.mese = mese;
    }

    public String getZonae() {
        return zonae;
    }

    public void setZonae(String zonae) {
        this.zonae = zonae;
    }

    public String getBarrioe() {
        return barrioe;
    }

    public void setBarrioe(String barrioe) {
        this.barrioe = barrioe;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getTipoactorinvolucradoe() {
        return tipoactorinvolucradoe;
    }

    public void setTipoactorinvolucradoe(String tipoactorinvolucradoe) {
        this.tipoactorinvolucradoe = tipoactorinvolucradoe;
    }

    public String getPersonasquetransitane() {
        return personasquetransitane;
    }

    public void setPersonasquetransitane(String personasquetransitane) {
        this.personasquetransitane = personasquetransitane;
    }

    public Integer getNumeroaccidentese() {
        return numeroaccidentese;
    }

    public void setNumeroaccidentese(Integer numeroaccidentese) {
        this.numeroaccidentese = numeroaccidentese;
    }

    public Integer getHeridose() {
        return heridose;
    }

    public void setHeridose(Integer heridose) {
        this.heridose = heridose;
    }

    public Integer getFallecidose() {
        return fallecidose;
    }

    public void setFallecidose(Integer fallecidose) {
        this.fallecidose = fallecidose;
    }

    public Date getFechae() {
        return fechae;
    }

    public void setFechae(Date fechae) {
        this.fechae = fechae;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ide != null ? ide.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadisticas)) {
            return false;
        }
        Estadisticas other = (Estadisticas) object;
        if ((this.ide == null && other.ide != null) || (this.ide != null && !this.ide.equals(other.ide))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uTactico.entity.Estadisticas[ ide=" + ide + " ]";
    }
    
}
