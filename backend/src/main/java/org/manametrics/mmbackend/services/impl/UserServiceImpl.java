package org.manametrics.mmbackend.services.impl;

import lombok.RequiredArgsConstructor;
import org.manametrics.mmbackend.entities.User;
import org.manametrics.mmbackend.repositories.UserRepository;
import org.manametrics.mmbackend.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> findUsers() {
        return userRepository.findAll();
    }
}
