package com.whc1998.businessexercise.employee;

public class Employee {
    private String firstName;
    private String lastName;
    private String Position;
    private Integer salary;

    public Employee(String firstName, String lastName, String position, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        Position = position;
        this.salary = salary;
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
