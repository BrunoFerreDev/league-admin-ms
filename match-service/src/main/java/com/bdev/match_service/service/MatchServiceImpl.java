package com.bdev.match_service.service;

import com.bdev.match_service.dto.GetMatchDTO;
import com.bdev.match_service.dto.MatchDTO;
import com.bdev.match_service.repository.MatchRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MatchServiceImpl implements MatchService {
    private final MatchRepo matchRepo;

    @Override
    public GetMatchDTO getByMatchId(Long matchId) {
        return null;
    }

    @Override
    public GetMatchDTO createMatch(MatchDTO matchDTO) {
        return null;
    }

    @Override
    public GetMatchDTO updateMatch(Long matchId, MatchDTO matchDTO) {
        return null;
    }

    @Override
    public Page<GetMatchDTO> getFixtureByCompetence(Long competitionId, int date, int page, int size) {
        return null;
    }
}
