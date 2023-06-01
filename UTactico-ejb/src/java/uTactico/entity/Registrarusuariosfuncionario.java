/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uTactico.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANDRES CASCAVITA
 */
@Entity
@Table(name = "REGISTRARUSUARIOSFUNCIONARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registrarusuariosfuncionario.findAll", query = "SELECT r FROM Registrarusuariosfuncionario r"),
    @NamedQuery(name = "Registrarusuariosfuncionario.findByCedula", query = "SELECT r FROM Registrarusuariosfuncionario r WHERE r.cedula = :cedula"),
    @NamedQuery(name = "Registrarusuariosfuncionario.findByNombreusuario", query = "SELECT r FROM Registrarusuariosfuncionario r WHERE r.nombreusuario = :nombreusuario"),
    @NamedQuery(name = "Registrarusuariosfuncionario.findByContrasena", query = "SELECT r FROM Registrarusuariosfuncionario r WHERE r.contrasena = :contrasena"),
    @NamedQuery(name = "Registrarusuariosfuncionario.findByCorreoelectronico", query = "SELECT r FROM Registrarusuariosfuncionario r WHERE r.correoelectronico = :correoelectronico")})
public class Registrarusuariosfuncionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CEDULA")
    private Integer cedula;
    @Size(max = 50)
    @Column(name = "NOMBREUSUARIO")
    private String nombreusuario;
    @Size(max = 100)
    @Column(name = "CONTRASENA")
    private String contrasena;
    @Size(max = 100)
    @Column(name = "CORREOELECTRONICO")
    private String correoelectronico;

    public Registrarusuariosfuncionario() {
    }

    public Registrarusuariosfuncionario(Integer cedula, String nombreusuario, String contrasena, String correoelectronico) {
        this.cedula = cedula;
        this.nombreusuario = nombreusuario;
        this.contrasena = contrasena;
        this.correoelectronico = correoelectronico;
    }

    public Registrarusuariosfuncionario(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registrarusuariosfuncionario)) {
            return false;
        }
        Registrarusuariosfuncionario other = (Registrarusuariosfuncionario) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uTactico.entity.Registrarusuariosfuncionario[ cedula=" + cedula + " ]";
    }
    
}
