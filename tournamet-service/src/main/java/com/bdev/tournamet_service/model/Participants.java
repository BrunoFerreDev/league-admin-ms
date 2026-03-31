package com.bdev.tournamet_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
@Entity
@Table(name = "tbl_participants")
public class Participants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long participantId;
    private final LocalDateTime registrationDate = LocalDateTime.now();
    private LocalDateTime lastUpdate;
    private Long clubId;

    @ManyToOne
    @JoinColumn(name = "competition_id", referencedColumnName = "competitionId")
    private Competition competition;
}
