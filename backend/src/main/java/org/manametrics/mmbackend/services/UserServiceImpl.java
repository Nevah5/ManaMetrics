package org.manametrics.mmbackend.services;

import lombok.RequiredArgsConstructor;
import org.manametrics.mmbackend.entities.User;
import org.manametrics.mmbackend.repositories.UserRepository;
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
