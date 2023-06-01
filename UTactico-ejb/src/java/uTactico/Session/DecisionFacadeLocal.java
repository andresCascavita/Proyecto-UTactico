/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uTactico.Session;

import java.util.List;
import javax.ejb.Local;
import uTactico.entity.Decision;

/**
 *
 * @author ANDRES CASCAVITA
 */
@Local
public interface DecisionFacadeLocal {

    void create(Decision decision);

    void edit(Decision decision);

    void remove(Decision decision);

    Decision find(Object id);

    List<Decision> findAll();

    List<Decision> findRange(int[] range);

    int count();
    
}
