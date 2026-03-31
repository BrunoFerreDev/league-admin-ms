package com.bdev.identity_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_persons")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;

    private String firstName, lastName;

    @Column(unique = true, nullable = false)
    private String dni;

    private LocalDate birthDate;
    @Column(unique = true, nullable = false)

    private String email;
    @Column(unique = true, nullable = false)
    private String phone;

    private Boolean isActive;
}
