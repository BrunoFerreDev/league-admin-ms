package com.bdev.tournamet_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
@Entity
@Table(name = "tbl_configurations")
public class TournamentConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tournamentConfigurationId;
    private String tournamentFormat; // Ej: "Round Robin", "Elimination", etc.
    private String typeDefinitionOnMatch; // Ej: "ExtraTime", "Penalti", etc.
    private int maxPlayersPerTeam;
    private int maxQualifyingTeams;

    @OneToMany(mappedBy = "tournamentConfiguration", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Tournament> tournaments = new HashSet<>();
}
