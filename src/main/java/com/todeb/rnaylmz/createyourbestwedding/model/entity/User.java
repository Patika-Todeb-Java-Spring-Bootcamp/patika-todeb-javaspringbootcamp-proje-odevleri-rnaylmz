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
    private Integer userId;

    @Column(unique = true, nullable = false)
    private String userName;


    @Column(unique = true, nullable = false)
    private String email;

    @Size(min = 6, message = "minimum password length has to be 6.")
    private String password;

  public User(String userName, String email, String password ){
      this.userName = userName;
      this.email = email;
      this.password = password;
  }

  @ElementCollection(fetch = FetchType.EAGER)
    private List<Role> optionsList;

    public String getRoles() {
        return getRoles();
    }
}
