package com.bdev.disciplinary_service.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SanctionDTO {
    //Days - Years - Months - Warning
    @NotBlank(message = "Type is required")
    private String type;

    @NotBlank(message = "Quantity is required")
    private Double quantity;

    @NotBlank(message = "Date of incident is required")
    private LocalDate dateOfIncident;

    @NotBlank(message = "Description is required")
    private String generalDescription;

    @NotBlank(message = "Resolution is required")
    private String resolution;

    @NotBlank(message = "Reason is required")
    private String reason;

    @NotBlank(message = "Entity sancioned is required")
    private Long entityId;

}
