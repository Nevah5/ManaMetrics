package org.manametrics.mmbackend.services.impl;

import lombok.RequiredArgsConstructor;
import org.manametrics.mmbackend.entities.Game;
import org.manametrics.mmbackend.repositories.GameRepository;
import org.manametrics.mmbackend.services.GameService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {
    private final GameRepository gameRepository;

    @Override
    public List<Game> findAll() {
        return gameRepository.findAll();
    }
}
