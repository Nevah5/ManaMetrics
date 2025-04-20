package org.manametrics.mmbackend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    @Getter
    private Long id;

    @Column(length = 32, nullable = false, name = "display_name")
    @Getter
    private String displayName;

    @Column(length = 24, nullable = false, unique = true)
    @Getter
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "created_at", nullable = false)
    @CreationTimestamp
    @Getter
    private Instant createdAt;
}
