package org.manametrics.mmbackend.services;

import org.manametrics.mmbackend.entities.Game;

import java.util.List;

public interface GameService {
    List<Game> findAll();
}
