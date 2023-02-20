package com.whc1998.businessexercise.equipment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.whc1998.businessexercise.business.Business;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity
public class Equipment {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=0)
    private String name;

    @ManyToOne
    @JsonIgnore
    private Business business;

    public Equipment() {
    }

    public Equipment(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                '}';
    }
}
