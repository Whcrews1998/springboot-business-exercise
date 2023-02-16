package com.whc1998.businessexercise.business;

import com.whc1998.businessexercise.employee.Employee;
import com.whc1998.businessexercise.equipment.Equipment;

import java.util.List;

public class Business {
    private String name;
    private List<Employee> employeeList;
    private List<Equipment> equipmentList;

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
