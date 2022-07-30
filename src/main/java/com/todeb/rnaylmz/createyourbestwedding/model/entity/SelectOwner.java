package com.todeb.rnaylmz.createyourbestwedding.model.entity;

import com.todeb.rnaylmz.createyourbestwedding.model.enums.OwnerOption;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class SelectOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private OwnerOption ownerOption;

    public void selectOwner(){

    }
}
