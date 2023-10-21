package web.service;

import org.springframework.stereotype.Service;
import web.Dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void update(long id, User updateUser) {
        userDao.update(id, updateUser);
    }

    @Override
    public void delete(long id) {
        userDao.delete(id);
    }

}
