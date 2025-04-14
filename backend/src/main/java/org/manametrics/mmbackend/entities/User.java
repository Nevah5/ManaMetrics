package org.manametrics.mmbackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length=63, nullable=false, unique=true)
    private String username;
}
