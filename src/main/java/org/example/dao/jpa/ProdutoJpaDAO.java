package org.example.dao.jpa;

import org.example.dao.generic.GenericJpaDB1DAO;
import org.example.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}