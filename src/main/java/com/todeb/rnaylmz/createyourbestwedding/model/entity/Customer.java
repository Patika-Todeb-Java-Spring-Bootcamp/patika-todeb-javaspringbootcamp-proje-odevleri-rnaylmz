package com.todeb.rnaylmz.createyourbestwedding.model.entity;

import com.todeb.rnaylmz.createyourbestwedding.model.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int giveLike;
    private int followBusinessOwner;
    private int givePoint;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<BusinessOwner> businessOwners;


  /*  private  static long idSequence = 1;

    public Customer(){
        this.id = ++idSequence;
    }*/
    //Entity içinde List tutulmaz. Bunun yerine ilişkiler kullanılır.






}
