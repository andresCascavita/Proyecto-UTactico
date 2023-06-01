/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uTactico.Session;

import java.util.List;
import javax.ejb.Local;
import uTactico.entity.Reporteincidente;

/**
 *
 * @author ANDRES CASCAVITA
 */
@Local
public interface ReporteincidenteFacadeLocal {

    void create(Reporteincidente reporteincidente);

    void edit(Reporteincidente reporteincidente);

    void remove(Reporteincidente reporteincidente);

    Reporteincidente find(Object id);

    List<Reporteincidente> findAll();

    List<Reporteincidente> findRange(int[] range);

    int count();
    
}
