package com.crm.sevaweb.controllers.vendedor;

import com.crm.sevaweb.dao.PersonaDAO;
import com.crm.sevaweb.dao.VendedorDAO;
import com.crm.sevaweb.model.Persona;
import com.crm.sevaweb.model.Vendedor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rtorres
 */
@Service
@Transactional
public class VendedorServiceImp implements VendedorService{

    @Autowired
    VendedorDAO vendedorDao;
    
    @Autowired
    PersonaDAO personaDao;
    
    @Override
    public List<Vendedor> allVendedores() {
        return vendedorDao.all();
    }

    @Override
    public Vendedor findVendedor(Long id) {
        return vendedorDao.find(id);
    }

    @Override
    public void guardar(Persona persona) {
        if(persona.getId() == null){
            personaDao.save(persona);
            
            Vendedor vendedor = new Vendedor();
            vendedor.setPersona(persona);
            vendedorDao.save(vendedor);
            
        }else{
            personaDao.update(persona);
        }
    }

    @Override
    public void delete(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
