package org.manametrics.mmbackend.services;


import org.manametrics.mmbackend.entities.Deck;

import java.util.List;

public interface DeckService {
    List<Deck> findAll();
}
