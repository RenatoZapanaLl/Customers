package com.example.Customers.Controller;

import com.example.Customers.Model.Customers;
import com.example.Customers.Service.ServiceCustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ControllerCustomers {

    @Autowired
    ServiceCustomers service;
    // SELECT ALL CUSTOMERS
    @GetMapping("/getCustomers")
    public Flux<Customers> getCustomers()
    {
        return service.findAll();
    }
    //SELECT CUSTOMERS WHERE NUMBER
    @GetMapping("/getCustomersByNumber/{Number}")
    public Flux<Customers> getCustomersByNumber(@PathVariable("Number") String Number)
    {
        return service.findCustomersByNumber(Number);
    }
    //INSERT CUSTOMERS
    @PostMapping("/postCustomers")
    Mono<Customers> postCustomers(@RequestBody Customers customer)
    {
        return service.save(customer);
    }
    //UPDATE CUSTOMER
    @PostMapping("/updCustomers")
    Mono<Customers> updCustomers (@RequestBody Customers customer)
    {
        return service.updateCustomer(customer);
    }
    //DELETE CUSTOMER
    @PostMapping("/delete/{id}")
    void delete(@PathVariable("id") String id)
    {
         service.delete(id);
    }

}
