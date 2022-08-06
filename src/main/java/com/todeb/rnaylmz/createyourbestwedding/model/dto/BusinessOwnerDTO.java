package com.todeb.rnaylmz.createyourbestwedding.model.dto;

import com.todeb.rnaylmz.createyourbestwedding.model.enums.OwnerOptions;
import lombok.Data;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Data
public class BusinessOwnerDTO {
    private String address;
    private String education;
    private double point;
    private OwnerOptions ownerOptions;

}
