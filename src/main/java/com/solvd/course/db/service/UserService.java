package com.solvd.course.db.service;

import com.solvd.course.db.binary.User;

public interface UserService {

    User create(User user);

    User getById(Long id);

}
