package app.service.impl;
import java.io.Serializable;
import java.util.List;

import app.model.Authors;
import app.service.AuthorService;
import org.jboss.logging.Logger;

public class AuthorServiceImpl extends BaseServiceImpl implements AuthorService {
    private static final Logger logger = Logger.getLogger(AuthorServiceImpl.class);
    @Override
    public Authors saveOrUpdate(Authors entity) {
        try {
            return getAuthorDAO().saveOrUpdate(entity);
        } catch (Exception e) {
            logger.error(e);
            throw e;
        }
    }

    @Override
    public boolean deleteAuthors(Integer id){
        try {
            Authors authors = getAuthorDAO().findById(id);
            return delete(authors);
        } catch (Exception e) {
            logger.error(e);
            throw e;
        }
    }

    @Override
    public Authors findById(Integer id){
        try {
            return getAuthorDAO().findById(id);
        } catch (Exception e) {
            logger.error(e);
            throw e;
        }
    }

    @Override
    public List<Authors> loadAuthors() {
        try {
            return getAuthorDAO().loadAuthors();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Authors findById(Serializable key) {
        try {
            return getAuthorDAO().findById(key);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean delete(Authors entity) {
        try {
            getAuthorDAO().delete(entity);
            return true;
        } catch (Exception e) {
            throw e;
        }
    }
}
