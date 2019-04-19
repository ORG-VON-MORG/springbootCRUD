package de.htwsaar.springbootCRUD.springbootCRUD.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Getter
@Setter
@ToString
@Entity
public class Country {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String capital;


}
