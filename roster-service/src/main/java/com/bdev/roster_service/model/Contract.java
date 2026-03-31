package com.bdev.roster_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_contracts")
@Inheritance(strategy = InheritanceType.JOINED)
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Long contractId;

    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean confirmed;
    private Boolean active;
    @Column(length = 255)
    private String description;
    @ManyToOne
    @JoinColumn(name = "club_id_h")
    private Club club;
}
