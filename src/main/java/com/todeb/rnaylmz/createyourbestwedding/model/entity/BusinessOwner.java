package com.todeb.rnaylmz.createyourbestwedding.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.todeb.rnaylmz.createyourbestwedding.model.Person;
import com.todeb.rnaylmz.createyourbestwedding.model.enums.OwnerOption;
import com.todeb.rnaylmz.createyourbestwedding.model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "businessOwner")
public class BusinessOwner extends Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String LastName;

    @Email
    private String email;
    private String address;
    private long IBAN;
    private double priceForJob;
    private String description;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Photograph photograph;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    private SelectOwner selectOwner;



}
