package com.todeb.rnaylmz.createyourbestwedding.model.entity;

import com.todeb.rnaylmz.createyourbestwedding.model.enums.BusinessOptions;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BusinessOption {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private BusinessOptions title;
    private int howManyOwner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
