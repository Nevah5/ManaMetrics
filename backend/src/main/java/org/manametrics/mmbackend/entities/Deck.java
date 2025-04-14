package org.manametrics.mmbackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "decks")
public class Deck {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String link;

    @JoinColumn(name = "user_id", nullable=false)
    @ManyToOne
    private User user;

}
