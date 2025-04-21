package org.manametrics.mmbackend.resources;

import lombok.RequiredArgsConstructor;
import org.manametrics.mmbackend.entities.Game;
import org.manametrics.mmbackend.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameResource {
    private final GameService gameService;

    @GetMapping
    private ResponseEntity<List<Game>> getAllGroups() {
        return ResponseEntity.ok(gameService.findAll());
    }
}
