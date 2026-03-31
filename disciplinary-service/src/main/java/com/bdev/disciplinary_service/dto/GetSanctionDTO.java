package com.bdev.disciplinary_service.dto;

import com.bdev.disciplinary_service.model.Sanction;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class GetSanctionDTO {
    private Long sanctionId;
    //Days - Years - Months - Warning
    private String type;

    private Double quantity;

    private LocalDate dateOfIncident;

    private String generalDescription;

    private String code;

    private Boolean active;

    private String resolution;

    private String reason;

    private String entityType;

    private Long entityId;

    private LocalDate registrationDate;

    public GetSanctionDTO(Sanction sanction) {
        this.sanctionId = sanction.getSanctionId();
        this.type = sanction.getType();
        this.quantity = sanction.getQuantity();
        this.dateOfIncident = sanction.getDateOfIncident();
        this.generalDescription = sanction.getGeneralDescription();
        this.code = sanction.getCode();
        this.active = sanction.getActive();
        this.resolution = sanction.getResolution();
        this.reason = sanction.getReason();
        this.entityType = sanction.getEntityType();
        this.entityId = sanction.getEntityId();
        this.registrationDate = sanction.getRegistrationDate();
    }
}
