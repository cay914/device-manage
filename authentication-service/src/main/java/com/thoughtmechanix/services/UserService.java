package com.thoughtmechanix.services;

import com.thoughtmechanix.authentication.model.User;

public interface UserService {
    User create(String username, String password);
}
