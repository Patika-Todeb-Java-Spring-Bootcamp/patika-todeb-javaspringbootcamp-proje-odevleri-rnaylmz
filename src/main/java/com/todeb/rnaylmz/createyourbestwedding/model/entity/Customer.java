package com.todeb.rnaylmz.createyourbestwedding.model.entity;

import com.todeb.rnaylmz.createyourbestwedding.model.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends Person implements Serializable {

    @Id
    private Long id;

    private int giveLike;
    private int followBusinessOwner;

    private int givePoint;

    private  static long idSequence = 1;

    public Customer(){
        this.id = ++idSequence;
    }



    public int followBusinessOwner(){
        return this.followBusinessOwner;
    }
    public int likePhotos(){
        return this.giveLike;
    }




}
