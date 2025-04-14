package org.manametrics.mmbackend.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "played_at",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Instant playedAt;

    @Column(name = "added_at",nullable = false)
    @CreationTimestamp
    private Instant addedAt;

    @Column(nullable = false)
    private String location;

    @JoinColumn(name = "winner_id",nullable = false)
    @ManyToOne
    private User winner;
}
