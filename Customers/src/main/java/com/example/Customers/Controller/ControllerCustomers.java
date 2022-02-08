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

    @GetMapping("/getCustomers")
    public Flux<Customers> getCustomers()
    {
        return service.findAll();
    }

    @PostMapping("/postCustomers")
    Mono<Customers> postCustomers(@RequestBody Customers customer)
    {
        return service.save(customer);
    }
}
