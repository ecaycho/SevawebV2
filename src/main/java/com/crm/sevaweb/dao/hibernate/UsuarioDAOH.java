/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.crm.sevaweb.dao.hibernate;

import com.crm.sevaweb.dao.UsuarioDAO;
import com.crm.sevaweb.model.Usuario;
import com.crm.sevaweb.model.Vendedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ecaycho
 */
@Repository
public class UsuarioDAOH extends BaseHibernateDAO implements UsuarioDAO{

    @Override
    public List<Usuario> all() {
        Criteria criteria = this.getSession().createCriteria(Vendedor.class);
        return criteria.list();
    }

    @Override
    public Usuario find(Long id) {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("id",id));
        return (Usuario)criteria.uniqueResult();
    }

    @Override
    public void save(Usuario t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Usuario t) {
         this.getSession().merge(t);
    }

    @Override
    public void delete(Usuario t) {
         this.getSession().delete(t);
    }
    
}
