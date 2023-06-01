/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uTactico.Session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uTactico.entity.Registrarusuarios;

/**
 *
 * @author ANDRES CASCAVITA
 */
@Stateless
public class RegistrarusuariosFacade extends AbstractFacade<Registrarusuarios> implements RegistrarusuariosFacadeLocal {

    @PersistenceContext(unitName = "UTacticoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistrarusuariosFacade() {
        super(Registrarusuarios.class);
    }
    
}
