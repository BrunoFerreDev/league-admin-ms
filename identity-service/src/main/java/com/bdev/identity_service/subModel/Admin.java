package com.bdev.identity_service.subModel;

import com.bdev.identity_service.model.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@PrimaryKeyJoinColumn(name = "person_id")
@Table(name = "tbl_admins")
public class Admin extends Person {
}
