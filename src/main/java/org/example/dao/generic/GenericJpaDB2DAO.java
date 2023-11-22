package org.example.dao.generic;

import org.example.domain.jpa.ClienteJpa;

public class GenericJpaDB2DAO<C, L extends Number> {
    public GenericJpaDB2DAO(Class<ClienteJpa> clienteJpaClass) {
    }
}
