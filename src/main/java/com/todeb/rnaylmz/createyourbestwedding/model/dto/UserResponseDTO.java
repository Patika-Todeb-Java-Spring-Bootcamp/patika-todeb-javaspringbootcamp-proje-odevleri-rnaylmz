package com.todeb.rnaylmz.createyourbestwedding.model.dto;

import com.todeb.rnaylmz.createyourbestwedding.model.enums.Role;
import lombok.Data;

import java.util.List;

@Data
public class UserResponseDTO {
    private Integer id;
    private String username;
    private String email;
    private List<Role> roles;
}
