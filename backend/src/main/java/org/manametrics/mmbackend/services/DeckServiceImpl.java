package org.manametrics.mmbackend.services;

import lombok.RequiredArgsConstructor;
import org.manametrics.mmbackend.entities.Deck;
import org.manametrics.mmbackend.repositories.DeckRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeckServiceImpl implements DeckService {
    private final DeckRepository deckRepository;

    @Override
    public List<Deck> findAll() {
        return deckRepository.findAll();
    }
}
