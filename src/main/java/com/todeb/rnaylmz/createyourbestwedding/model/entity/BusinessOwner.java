package com.todeb.rnaylmz.createyourbestwedding.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.todeb.rnaylmz.createyourbestwedding.model.Person;
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
public class  BusinessOwner extends Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private long IBAN;
    private String education;

    //private List<Photograph> photographs;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Photograph photograph;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    private BusinessOption businessOption;


    @ManyToOne(optional = false)
    private Photograph photographs;

}
