package org.example.dao.jpa;

import org.example.dao.generic.GenericJpaDB2DAO;
import org.example.domain.jpa.ClienteJpa;
import org.example.exceptions.DAOException;
import org.example.exceptions.MaisDeUmRegistroException;
import org.example.exceptions.TableException;
import org.example.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;


public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }

    @Override
    public ClienteJpa cadastrar(ClienteJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public void excluir(ClienteJpa entity) throws DAOException {

    }

    @Override
    public ClienteJpa alterar(ClienteJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public ClienteJpa consultar(Long id) throws MaisDeUmRegistroException, TableException, DAOException {
        return null;
    }

    @Override
    public Collection<ClienteJpa> buscarTodos() throws DAOException {
        return null;
    }
}