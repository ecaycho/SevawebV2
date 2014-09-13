/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.sevaweb.controllers.vendedor;

import com.crm.sevaweb.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author rtorres
 */
@Controller
@RequestMapping("/adm/vendedor")
public class VendedorController {
    
    @Autowired
    VendedorService service;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        return "vendedor/index";
    }
    
    @RequestMapping("nuevo")
    public String nuevo(Model model){ 
                   
        return "vendedor/formulario";
    }
    
    @RequestMapping("editar")
    public String editar(Model model){ 
        
            
        return "vendedor/formulario";
    }
    
    @RequestMapping("guardar")
    public String guardar(Persona persona, Model model){ 
        
        service.guardar(persona);
        
        return "redirect:/adm/vendedor";
    }
    
}
