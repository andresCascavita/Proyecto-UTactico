/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uTactico.Session;

import java.util.List;
import javax.ejb.Local;
import uTactico.entity.Registrarusuarios;

/**
 *
 * @author ANDRES CASCAVITA
 */
@Local
public interface RegistrarusuariosFacadeLocal {

    void create(Registrarusuarios registrarusuarios);

    void edit(Registrarusuarios registrarusuarios);

    void remove(Registrarusuarios registrarusuarios);

    Registrarusuarios find(Object id);

    List<Registrarusuarios> findAll();

    List<Registrarusuarios> findRange(int[] range);

    int count();
    
}
