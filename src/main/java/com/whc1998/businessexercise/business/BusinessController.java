package com.whc1998.businessexercise.business;

import com.whc1998.businessexercise.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
        return repository.findById(id).get();
    }

    @GetMapping("/businesses/{id}/employees")
    public List<Employee> retrieveAllEmployees(@PathVariable int id) {
        Optional<Business> business = repository.findById(id);
        return business.get().getEmployeeList();
    }
    

}
