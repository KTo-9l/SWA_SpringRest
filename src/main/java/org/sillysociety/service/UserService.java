package org.sillysociety.service;

import org.sillysociety.models.swa.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    void delete(User user);
    User getById(Integer id);
    List<User> getAllUsers();
    User updateUser(User user);
    User getByLogin(String login);
    User getByEmail(String email);
    Boolean existsByLogin(String login);
}
