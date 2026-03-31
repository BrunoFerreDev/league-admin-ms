package com.bdev.match_service.controller;

import com.bdev.match_service.dto.GetMatchDTO;
import com.bdev.match_service.dto.MatchDTO;
import com.bdev.match_service.service.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/match", name = "Match Endpoint")
@RequiredArgsConstructor
public class MatchController {
    private final MatchService matchService;

    @GetMapping(value = "/get/{matchId}")
    public ResponseEntity<GetMatchDTO> getMatchById(@PathVariable Long matchId) {
        return ResponseEntity.of(Optional.of(matchService.getByMatchId(matchId)));
    }

    @PostMapping(value = "/create")
    public ResponseEntity<GetMatchDTO> createMatch(@RequestBody MatchDTO matchDTO) {
        return ResponseEntity.of(Optional.of(matchService.createMatch(matchDTO)));
    }

    @PutMapping(value = "/update")
    public ResponseEntity<GetMatchDTO> updateMatch(@RequestParam Long matchId, @RequestBody MatchDTO matchDTO) {
        return ResponseEntity.of(Optional.of(matchService.updateMatch(matchId, matchDTO)));
    }

    @GetMapping("/get/allByCompetitionId")
    public ResponseEntity<Page<GetMatchDTO>> getMatches(@RequestParam Long competitionId, @RequestParam int date, @RequestParam int page, @RequestParam int size) {
        return ResponseEntity.of(Optional.of(matchService.getFixtureByCompetence(competitionId, date, page, size)));
    }
}
