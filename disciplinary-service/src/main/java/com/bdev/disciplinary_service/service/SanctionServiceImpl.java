package com.bdev.disciplinary_service.service;

import com.bdev.disciplinary_service.dto.GetSanctionDTO;
import com.bdev.disciplinary_service.dto.SanctionDTO;
import com.bdev.disciplinary_service.model.Sanction;
import com.bdev.disciplinary_service.repository.SanctionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SanctionServiceImpl implements SanctionService {
    private final SanctionRepo sanctionRepo;

    @Override
    public GetSanctionDTO addSanction(SanctionDTO sanction) {

    }
}
