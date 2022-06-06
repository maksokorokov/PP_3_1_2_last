package ru.kata.spring.boot_security.demo.service;



import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;


public interface UserService extends UserDetailsService {

    void saveUser(User user);
    User getUser(Long id);
    void deleteUser(User user);
    List<User> getUsersList();

}
