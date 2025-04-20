package org.manametrics.mmbackend.services;

import org.manametrics.mmbackend.entities.User;

import java.util.List;

public interface UserService {
    List<User> findUsers();
}
