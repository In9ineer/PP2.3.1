package web.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Component
public class UserDao {

//    private final SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;

//    @Autowired
//    public UserDao(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

    @Transactional(readOnly = true)
    public List<User> getUsers() {
        return entityManager.createQuery("select p from User p", User.class)
                .getResultList();
    }

    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }

    @Transactional(readOnly = true)
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    public void update(long id, User updateUser) {
        User userToBeUpdate = entityManager.find(User.class, id);

        userToBeUpdate.setFirstName(updateUser.getFirstName());
        userToBeUpdate.setLastName(updateUser.getLastName());
        userToBeUpdate.setEmail(updateUser.getEmail());
    }

    @Transactional
    public void delete(long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

}
