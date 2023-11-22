package org.example.dao.jpa;

import org.example.dao.generic.IGenericJpaDAO;
import org.example.domain.jpa.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJpaDAO<T, Long>{

}