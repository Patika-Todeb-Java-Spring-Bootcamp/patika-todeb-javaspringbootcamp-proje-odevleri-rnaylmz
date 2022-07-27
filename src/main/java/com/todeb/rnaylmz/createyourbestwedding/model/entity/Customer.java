package com.todeb.rnaylmz.createyourbestwedding.model.entity;

import com.todeb.rnaylmz.createyourbestwedding.model.User;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Customer extends User implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String detailsAboutWishes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
