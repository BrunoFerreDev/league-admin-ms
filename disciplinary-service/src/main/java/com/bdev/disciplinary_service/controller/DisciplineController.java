package com.bdev.disciplinary_service.controller;

import com.bdev.disciplinary_service.dto.GetSanctionDTO;
import com.bdev.disciplinary_service.dto.SanctionDTO;
import com.bdev.disciplinary_service.service.SanctionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/discipline", name = "DisciplineController")
@RequiredArgsConstructor
public class DisciplineController {
    private final SanctionService sanctionService;

    @PostMapping(value = "/add", name = "addDiscipline")
    public ResponseEntity<GetSanctionDTO> createSanction(@RequestBody SanctionDTO sanction) {
        return ResponseEntity.of(Optional.of(sanctionService.addSanction(sanction)));
    }

    @GetMapping(value = "/get/{sanctionId}", name = "getDiscipline")
    public ResponseEntity<Object> getSanction(@PathVariable Long sanctionId) {
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/get/all", name = "get all disciplines by entity id")
    public ResponseEntity<Page<Object>> getAllDisciplinesByEntityId(@RequestParam Long entityId, @RequestParam int page, @RequestParam int size) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/delete/{sanctionId}", name = "deleteDiscipline")
    public ResponseEntity<Object> deleteSanction(@PathVariable Long sanctionId) {
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/update/{sanctionId}", name = "updateDiscipline")
    public ResponseEntity<Object> updateSanction(@PathVariable Long sanctionId) {
        return ResponseEntity.ok().build();
    }
}
