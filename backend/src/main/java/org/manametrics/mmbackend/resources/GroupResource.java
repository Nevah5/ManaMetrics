package org.manametrics.mmbackend.resources;

import lombok.RequiredArgsConstructor;
import org.manametrics.mmbackend.entities.Group;
import org.manametrics.mmbackend.services.GroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/groups")
@RequiredArgsConstructor
public class GroupResource {
    private final GroupService groupService;

    @GetMapping
    private ResponseEntity<List<Group>> getAllGroups() {
        return ResponseEntity.ok(groupService.findGroups());
    }
}
