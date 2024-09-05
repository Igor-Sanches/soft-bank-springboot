package com.bank.soft.service;

import com.bank.soft.domain.models.User;

public interface UserService {

    User findById(long id);

    User create(User user);
}