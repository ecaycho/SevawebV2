/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.sevaweb.helper;

import java.util.List;

/**
 *
 * @author rtorres
 */
public interface GenericCrud<T> {
    
   
    List<T> all();

    T find(Long id);

    void save(T t);

    void update(T t);

    void delete(T t);
    
}
