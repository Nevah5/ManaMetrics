package org.manametrics.mmbackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "participants")
public class Participant {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long position;

    @Column(name = "guest_name", length = 63)
    private String guestName;

    private String comment;

    @JoinColumn(name = "deck_id", nullable = false)
    @ManyToOne
    private Deck deck;

    @JoinColumn(name = "game_id", nullable = false)
    @ManyToOne
    private Game game;

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne
    private User user;
}
