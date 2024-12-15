package com.ansari.project.uber.uber.entities;


import com.ansari.project.uber.uber.entities.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;


//this table is only for user // or for authentication
@Entity
@Table(name = "app_user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identity is not working in the batch (multiple operation)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    //(EnumType.STRING- it directly store data in string format like Rider, Driver, Admin).
    //(EnumType.ORDINAL-for this hibernate will define the different type of numerology for different type of role Ex {0 for driver, 1 for admin, 2 for rider}).
    private Set<Role> roles;
}
