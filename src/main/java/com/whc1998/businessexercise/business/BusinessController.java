package com.whc1998.businessexercise.business;

import com.whc1998.businessexercise.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/*

/businesses - Return all businesses
/businesses/{id} - Return business based on ID

*/


@RestController
public class BusinessController {

    private BusinessRepo repository;

    public BusinessController(BusinessRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/businesses")
    public List<Business> retrieveAllBusinesses() {
        return repository.findAll();
    }

    @GetMapping("/businesses/{id}")
    public Business retrieveBusinessById(@PathVariable int id) {
        // !! Check for NULL users and create EXCEPTION !!
        // ?? Implement Hateoas Standard ??
        Optional<Business> business = repository.findById(id);

        if (business.isEmpty()){
            throw new RuntimeException("Business does not exist...");
        }

        return business.get();
    }

    @GetMapping("/businesses/{id}/employees")
    public List<Employee> retrieveAllEmployees(@PathVariable int id) {
        Optional<Business> business = repository.findById(id);

        if (business.isEmpty()) {
            throw new RuntimeException("Business does not exist...");
        }

        return business.get().getEmployeeList();
    }

    @GetMapping("/businesses/{id}/employees/{empId}")
    public Employee retrieveEmployee(@PathVariable int id, @PathVariable int empId) {
        Optional<Business> business = repository.findById(id);

        if (business.isEmpty()) {
            throw new RuntimeException("Business does not exist...");
        }

        // Functional Programming to find employee in list
        Predicate<? super Employee> predicate = employee -> employee.getId().equals(empId);
        Employee employee = business.get().getEmployeeList().stream().filter(predicate).findFirst().orElse(null);

        return employee;
    }


}
