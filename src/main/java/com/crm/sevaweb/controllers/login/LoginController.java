/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.crm.sevaweb.controllers.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ecaycho
 */
@Controller
@RequestMapping("/")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        return "login";
    }
    
    
    @RequestMapping("iniciarSesion")
    public String LoginIn(){
        
        System.out.println("hola - adios 2");
        
        return "redirect:/adm/vendedor";
    }
}
