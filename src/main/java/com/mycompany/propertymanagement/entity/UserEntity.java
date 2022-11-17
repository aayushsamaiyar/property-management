package com.mycompany.propertymanagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="USER_TABLE")
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ownerName;
    @Column(name = "EMAIL", nullable = false)
    private String ownerEmail;
    private String phone;
    private String password;
}
