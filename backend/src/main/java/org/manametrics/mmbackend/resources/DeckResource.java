package org.manametrics.mmbackend.resources;

import lombok.RequiredArgsConstructor;
import org.manametrics.mmbackend.entities.Deck;
import org.manametrics.mmbackend.services.DeckService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/decks")
@RequiredArgsConstructor
public class DeckResource {
    private final DeckService deckService;

    @GetMapping
    private ResponseEntity<List<Deck>> findAll() {
        return ResponseEntity.ok(deckService.findAll());
    }
}
