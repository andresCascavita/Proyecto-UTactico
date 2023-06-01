/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uTactico.Session;

import java.util.List;
import javax.ejb.Local;
import uTactico.entity.Registrarusuariosfuncionario;

/**
 *
 * @author ANDRES CASCAVITA
 */
@Local
public interface RegistrarusuariosfuncionarioFacadeLocal {

    void create(Registrarusuariosfuncionario registrarusuariosfuncionario);

    void edit(Registrarusuariosfuncionario registrarusuariosfuncionario);

    void remove(Registrarusuariosfuncionario registrarusuariosfuncionario);

    Registrarusuariosfuncionario find(Object id);

    List<Registrarusuariosfuncionario> findAll();

    List<Registrarusuariosfuncionario> findRange(int[] range);

    int count();
    
}
