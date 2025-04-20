package org.manametrics.mmbackend.services;

import org.manametrics.mmbackend.entities.User;
import org.manametrics.mmbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findUsers() {
        return userRepository.findAll();
    }
}
