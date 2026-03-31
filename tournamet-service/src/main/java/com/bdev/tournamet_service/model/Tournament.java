package com.bdev.tournamet_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
@Entity
@Table(name = "tbl_tournaments")
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tournamentId;

    private String name;
    private Integer season;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean active;

    @OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Competition> competitions = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "configuration_id", referencedColumnName = "tournamentConfigurationId")
    private TournamentConfiguration tournamentConfiguration;
}
