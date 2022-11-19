package com.mycompany.propertymanagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {
    private Long id;
    private String ownerName;
    @NotNull(message = "owner email is mandatory")
    @NotEmpty(message = "password cannot be empty")
    @Size(min = 1, max = 50, message = "owner email shhould be between 1 to 50 characters")
    private String ownerEmail;
    private String phone;
    @NotNull
    @Size(min=8, max=16, message = "password between 8 to 16")
    @NotEmpty(message = "password cannot be empty")
    private String password;
}