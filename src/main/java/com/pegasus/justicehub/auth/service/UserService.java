package com.pegasus.justicehub.auth.service;

import com.pegasus.justicehub.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
