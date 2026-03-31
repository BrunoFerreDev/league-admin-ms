package com.bdev.match_service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
@Entity
@Table(name = "tbl_match_details")
public class MatchDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matchDetailId;

    @Min(1)
    private int minute;

    private Long entityId;
    private String entityType; // "Player", "Referee", "Team", etc.

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Events event;

    @ManyToOne
    @JoinColumn(name = "match_id")
    private Match match;

}
