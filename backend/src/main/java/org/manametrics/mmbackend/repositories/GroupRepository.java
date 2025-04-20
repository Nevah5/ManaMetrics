package org.manametrics.mmbackend.repositories;

import org.manametrics.mmbackend.entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
