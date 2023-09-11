package app.service.impl;

import app.dao.AuthorDAO;
import app.model.Authors;

public class BaseServiceImpl {
    protected AuthorDAO authorDAO;

    public AuthorDAO getAuthorDAO() {
        return authorDAO;
    }

    public void setAuthorDAO(AuthorDAO authorDAO){
        this.authorDAO = authorDAO;
    }
}
