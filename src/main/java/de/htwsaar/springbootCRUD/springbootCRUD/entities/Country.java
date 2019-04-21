package de.htwsaar.springbootCRUD.springbootCRUD.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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


    public Country(String name, String capital){
        this.name = name;
        this.capital = capital;
    }

    public Country(){

    }


}
