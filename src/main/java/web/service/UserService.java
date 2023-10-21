package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    void save(User user);

    User getUserById(long id);

    void update(long id, User updateUser);

    void delete(long id);
}
