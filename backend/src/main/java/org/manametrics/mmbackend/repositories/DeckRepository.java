package org.manametrics.mmbackend.repositories;

import org.manametrics.mmbackend.entities.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckRepository extends JpaRepository<Deck, Long> {
}
