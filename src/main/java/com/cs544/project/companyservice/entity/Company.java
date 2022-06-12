package com.cs544.project.companyservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue
    private Long companyId;
    @Column(nullable = false) // I added this, for one reason the database was adding null values.
    private String companyName;
    @Lob
    @Column(nullable = false)
    private String companyAddress;


}
