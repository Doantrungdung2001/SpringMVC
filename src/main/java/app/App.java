package app;

import app.dao.impl.AuthorDAOImpl;
import app.model.Authors;

public class App {
    public static void main(String[] args) {
        AuthorDAOImpl authorDAO = new AuthorDAOImpl();
        authorDAO.loadAuthors();
    }
}
