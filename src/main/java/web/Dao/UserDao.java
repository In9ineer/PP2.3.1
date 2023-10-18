package web.Dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {
    private List<User> testUsersList;
    private static long testId;

    {
        testUsersList = new ArrayList<>();

        testUsersList.add(new User("John", "Doe", "john.doe@example.com"));
        testUsersList.add(new User("Jane", "Smith", "jane.smith@example.com"));
        testUsersList.add(new User("Michael", "Johnson", "michael.johnson@example.com"));
        testUsersList.add(new User("Emily", "Brown", "emily.brown@example.com"));

    }

    public List<User> getUsers() {
        return testUsersList;
    }

    public void save(User user) {

        user.setId(++testId);
        testUsersList.add(user);
    }
}
