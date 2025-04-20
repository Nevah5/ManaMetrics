package org.manametrics.mmbackend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "decks")
@Getter
public class Deck {
    @Id
    @GeneratedValue
    private Long id;

    @JoinColumn(name = "creator_id", nullable = false)
    @ManyToOne
    private User owner;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String link;

    @Column(name = "added_at", nullable = false)
    @CreationTimestamp
    private Instant addedAt;
}
