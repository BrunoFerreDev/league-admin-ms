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
@Table(name = "tbl_competitions")
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long competitionId;
    private String category;
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "tournament_id", referencedColumnName = "tournamentId")
    private Tournament tournament;
    @ManyToOne
    @JoinColumn(name = "competence_cfg_id", referencedColumnName = "competenceConfigurationId")
    private CompetenceConfiguration competenceCfg;

    @OneToMany(mappedBy = "competition", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Participants> participants = new HashSet<>();
}
