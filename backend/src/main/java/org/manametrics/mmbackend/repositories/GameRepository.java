package org.manametrics.mmbackend.repositories;

import org.manametrics.mmbackend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
