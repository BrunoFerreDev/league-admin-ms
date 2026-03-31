package com.bdev.roster_service.subModel;

import com.bdev.roster_service.model.Contract;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_contract_players")
@PrimaryKeyJoinColumn(name = "contract_id")
public class ContractPlayer extends Contract {
    private String position;
    private Long idPlayerH;
}
