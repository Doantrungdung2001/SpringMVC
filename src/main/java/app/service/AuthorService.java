package app.service;

import java.util.List;

import app.model.Authors;

public interface AuthorService extends BaseService<Integer, Authors> {
    boolean deleteAuthors(Integer id);
    Authors findById(Integer id);
//    List<Authors> searchAuthors(String name);
    List<Authors> loadAuthors();

}
