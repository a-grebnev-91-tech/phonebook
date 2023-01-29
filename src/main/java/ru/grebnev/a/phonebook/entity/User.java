package ru.grebnev.a.phonebook.entity;

import lombok.Getter;
import lombok.Setter;
import ru.grebnev.a.phonebook.model.Role;
import ru.grebnev.a.phonebook.model.UserStatus;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "user_password")
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Enumerated(EnumType.STRING)
    @Column(name  = "user_role")
    private Role role;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private UserStatus status;
}
