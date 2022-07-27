package com.todeb.rnaylmz.createyourbestwedding.model.entity;

import com.todeb.rnaylmz.createyourbestwedding.model.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class BusinessOwner extends User implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String address;
    private long IBAN;
    private double priceForJob;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
