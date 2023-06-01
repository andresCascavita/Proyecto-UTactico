/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uTactico.Session;

import java.util.List;
import javax.ejb.Local;
import uTactico.entity.Estadisticas;

/**
 *
 * @author ANDRES CASCAVITA
 */
@Local
public interface EstadisticasFacadeLocal {

    void create(Estadisticas estadisticas);

    void edit(Estadisticas estadisticas);

    void remove(Estadisticas estadisticas);

    Estadisticas find(Object id);

    List<Estadisticas> findAll();

    List<Estadisticas> findRange(int[] range);

    int count();
    
}
