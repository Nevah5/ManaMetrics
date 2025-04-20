package org.manametrics.mmbackend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

/**
 * Game participant
 */
@Entity
@Table(name = "game_participants")
@Getter
public class GameParticipant {
    @Id
    @GeneratedValue
    private Long id;

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne
    private User user;

    @JoinColumn(name = "deck_id", nullable = false)
    @ManyToOne
    private Deck deck;

    @JoinColumn(name = "game_id", nullable = false)
    @ManyToOne
    private Game game;

    @Column(nullable = false)
    private Long position;

    @Column(name = "guest_name", length = 63)
    private String guestName;

    private String comment;
}
