package org.example.dao.generic;

import java.io.Serializable;

import org.example.domain.jpa.Persistente;

/**
 * @author rodrigo.pires
 *
 */
public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB3DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Mysql1");
    }

}