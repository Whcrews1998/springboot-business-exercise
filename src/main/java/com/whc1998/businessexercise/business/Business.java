package com.whc1998.businessexercise.business;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.whc1998.businessexercise.employee.Employee;
import com.whc1998.businessexercise.equipment.Equipment;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class Business {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=1)
    private String name;

    @OneToMany(mappedBy = "business")
    private List<Employee> employeeList;

    @OneToMany(mappedBy = "business")
    private List<Equipment> equipmentList;

    public Business() {
    }

    public Business(String name, List<Employee> employeeList, List<Equipment> equipmentList) {
        this.name = name;
        this.employeeList = employeeList;
        this.equipmentList = equipmentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    @Override
    public String toString() {
        return "Business{" +
                "name='" + name + '\'' +
                ", employeeList=" + employeeList +
                ", equipmentList=" + equipmentList +
                '}';
    }
}
