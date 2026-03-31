package com.bdev.disciplinary_service.repository;

import com.bdev.disciplinary_service.model.Sanction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanctionRepo extends JpaRepository<Sanction, Long> {
    Sanction findByCode(String code);

    Page<Sanction> findAllByEntityId(Long id, Pageable pageable);
}
