package com.bdev.disciplinary_service.model;

import com.bdev.disciplinary_service.dto.SanctionDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
@Entity
@Table(name = "tbl_sanctions")
@Inheritance(strategy = InheritanceType.JOINED)
public class Sanction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sanctionId;
    //Days - Years - Months - Warning
    private String type;

    private Double quantity;

    private LocalDate dateOfIncident;

    @Column(length = 255)
    private String generalDescription;

    @Column(unique = true)
    private String code;

    private Boolean active;

    private String resolution;

    private String reason;

    private String entityType;

    @Column(nullable = false)
    private Long entityId;

    private final LocalDate registrationDate = LocalDate.now();

    public Sanction(SanctionDTO sanctionDTO) {
        this.type = sanctionDTO.getType();
        this.quantity = sanctionDTO.getQuantity();
        this.dateOfIncident = sanctionDTO.getDateOfIncident();
        this.generalDescription = sanctionDTO.getGeneralDescription();
        this.resolution = sanctionDTO.getResolution();
        this.reason = sanctionDTO.getReason();
        this.entityId = sanctionDTO.getEntityId();
    }
}
