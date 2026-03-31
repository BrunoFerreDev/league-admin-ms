package com.bdev.match_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchDTO {

    private int dayOfCompetition;

    private LocalDateTime matchDate;

    private Long competitionId;

    private Long homeTeamId;

    private Long awayTeamId;
}
