package app.dao;

import app.model.Authors;

import java.util.List;

public interface AuthorDAO extends BaseDAO<Integer, Authors>{
    Authors findById(int id);

    List<Authors> loadAuthors();
}
