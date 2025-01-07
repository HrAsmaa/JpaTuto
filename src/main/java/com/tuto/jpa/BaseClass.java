package com.tuto.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseClass {

    @Id
    @GeneratedValue
    private Integer id;

    private LocalDate createdAt;

    private LocalDate lastModified;

    private String createdBy;

    private String lastModifiedBy;
}
