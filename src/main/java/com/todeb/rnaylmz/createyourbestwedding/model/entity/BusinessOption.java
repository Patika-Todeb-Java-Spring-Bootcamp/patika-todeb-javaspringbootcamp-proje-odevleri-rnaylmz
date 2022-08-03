package com.todeb.rnaylmz.createyourbestwedding.model.entity;

import lombok.Data;
import com.todeb.rnaylmz.createyourbestwedding.model.enums.OwnerOption;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class BusinessOption{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double price;

    private OwnerOption ownerOption;



    public void selectOwnerBusiness(){

    }

    public enum OwnerOption {

        MakeupArtist,
        Photographer,
        Organizer,
        PastrySeller,
        WeddingDressSeller,
        Florist,

    }

}


