package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.Dao.UserDao;
import web.model.User;

@Controller
public class UserController {

//    private final UserService userService;
//
//    public UsersController(UserService userService) {
//        this.userService = userService;
//    }

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping(value = "/")
    public String getUsers(ModelMap model) {
        model.addAttribute("UserTable", userDao.getUsers());

        return "getUsers";
    }

    @GetMapping("/addUser")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        return "addUser";
    }

    @PostMapping("/createUser")
    public String creatUser(@ModelAttribute("user") User user) {
        userDao.save(user);

        return "redirect:/";
    }

    @GetMapping("editUser")
    public String editUser() {

        return "editUser";
    }

    @GetMapping("deleteUser")
    public String deleteUser() {

        return "deliteUser";
    }

}
