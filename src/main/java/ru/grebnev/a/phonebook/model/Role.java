package ru.grebnev.a.phonebook.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Getter
@RequiredArgsConstructor
public enum Role {
    ADMIN(Set.of(Permission.READ, Permission.WRITE, Permission.CREATE)),
    USER(Set.of(Permission.READ, Permission.WRITE));

    private final Set<Permission> permissions;
}
