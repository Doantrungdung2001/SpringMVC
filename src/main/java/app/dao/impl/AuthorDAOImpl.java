package app.dao.impl;

import app.dao.AuthorDAO;
import app.dao.GenericDAO;
import app.model.Authors;
import org.hibernate.SessionFactory;

import java.util.List;

public class AuthorDAOImpl extends GenericDAO<Integer, Authors> implements AuthorDAO {
    public AuthorDAOImpl() {
        super(Authors.class);
    }

    public AuthorDAOImpl(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }

    @Override
    public Authors findById(int id){
        return (Authors) getSession().createQuery("FROM Authors where authorId = ?").setParameter(0,id).getSingleResult();
    }

    @Override
    public List<Authors> loadAuthors() {
        return getSession().createQuery("FROM Authors").getResultList();
    }
}
