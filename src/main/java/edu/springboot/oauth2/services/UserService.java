package edu.springboot.oauth2.services;


import edu.springboot.oauth2.domains.User;

public interface UserService {
    Iterable<User> getUsers();
}
