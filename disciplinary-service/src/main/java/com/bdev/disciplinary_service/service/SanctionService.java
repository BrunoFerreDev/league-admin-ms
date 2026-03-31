package com.bdev.disciplinary_service.service;

import com.bdev.disciplinary_service.dto.GetSanctionDTO;
import com.bdev.disciplinary_service.dto.SanctionDTO;

public interface SanctionService {
    GetSanctionDTO addSanction(SanctionDTO sanction);
}
