package ru.grebnev.a.phonebook.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Permission {
    READ("entry:read"),
    WRITE("entry:write"),
    CREATE("user:create");

    private final String permission;
}
