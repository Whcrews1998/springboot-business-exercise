package com.whc1998.businessexercise.employee;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.whc1998.businessexercise.business.Business;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;


    private String firstName;


    private String lastName;


    private String Position;

    private Integer salary;

    @ManyToOne
    @JsonIgnore
    private Business business;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String position, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        Position = position;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Position='" + Position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
