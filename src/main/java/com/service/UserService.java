package com.service;

import java.util.List;

import com.entry.User;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

	User getUser(String userId);
}