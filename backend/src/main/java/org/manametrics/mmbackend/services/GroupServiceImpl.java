package org.manametrics.mmbackend.services;

import lombok.RequiredArgsConstructor;
import org.manametrics.mmbackend.entities.Group;
import org.manametrics.mmbackend.repositories.GroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;

    @Override
    public List<Group> findGroups() {
        return groupRepository.findAll();
    }
}
