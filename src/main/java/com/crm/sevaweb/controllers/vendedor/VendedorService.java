/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.sevaweb.controllers.vendedor;

import com.crm.sevaweb.model.Persona;
import com.crm.sevaweb.model.Vendedor;
import java.util.List;

public interface VendedorService {
    
    List<Vendedor> allVendedores();
    Vendedor findVendedor(Long id);
    void guardar(Persona persona);
    void delete(Persona persona);
}
