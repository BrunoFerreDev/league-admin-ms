package com.bdev.match_service.service;

import com.bdev.match_service.dto.GetMatchDTO;
import com.bdev.match_service.dto.MatchDTO;
import org.springframework.data.domain.Page;


public interface MatchService {
    GetMatchDTO getByMatchId(Long matchId);

    GetMatchDTO createMatch(MatchDTO matchDTO);

    GetMatchDTO updateMatch(Long matchId, MatchDTO matchDTO);

    Page<GetMatchDTO> getFixtureByCompetence(Long competitionId, int date, int page, int size);
}
