package com.bdev.match_service.repository;

import com.bdev.match_service.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repositorys
public interface MatchRepo extends JpaRepository<Match, Long> {
}
