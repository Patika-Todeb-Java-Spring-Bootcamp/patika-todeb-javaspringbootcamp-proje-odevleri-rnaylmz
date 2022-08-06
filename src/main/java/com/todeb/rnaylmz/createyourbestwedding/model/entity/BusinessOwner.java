package com.todeb.rnaylmz.createyourbestwedding.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.todeb.rnaylmz.createyourbestwedding.model.Person;

import com.todeb.rnaylmz.createyourbestwedding.model.enums.OwnerOptions;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "businessOwner")
public class  BusinessOwner extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IBAN;

    @NotNull(message = "Enter your address for suitable customers")
    private String address;

    @NotNull(message = "Add your education and certification info")
    private String education;



    @NotBlank(message = "Give a price for your job, you can make dail with customer on messaging later.")
    private Double price;

    @Enumerated(EnumType.STRING)
    @Column(name = "owner_option")
    private OwnerOptions ownerOptions;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Photograph photograph;

}
