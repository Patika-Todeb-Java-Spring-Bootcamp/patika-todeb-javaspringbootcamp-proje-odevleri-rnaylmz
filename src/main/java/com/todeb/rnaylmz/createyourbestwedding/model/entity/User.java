package com.todeb.rnaylmz.createyourbestwedding.model.entity;

import com.todeb.rnaylmz.createyourbestwedding.model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String username;


    @Column(unique = true, nullable = false)
    private String email;

    @Size(min = 6, message = "minimum password length has to be 6.")
    private String password;

  public User(String username, String email, String password ){
      this.username = username;
      this.email = email;
      this.password = password;
  }

  @ElementCollection(fetch = FetchType.EAGER)
    private List<Role> roles;

    /*public List<Role> getRoles() {
        return getRoles();
    }*/
}
