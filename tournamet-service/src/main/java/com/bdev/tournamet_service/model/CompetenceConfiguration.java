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
@Table(name = "tbl_competence_configurations")
public class CompetenceConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long competenceConfigurationId;
    private int minutesPerTime;
    private int extraTimeMinutes;
    private int penaltyShootoutRounds;
    private int maxSusbstitutions;
    @OneToMany(mappedBy = "competenceCfg", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Competition> competitions = new HashSet<>();
}
