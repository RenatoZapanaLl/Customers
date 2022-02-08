package com.example.Customers.Service;

import com.example.Customers.Model.Customers;
import com.example.Customers.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServiceCustomersImpl implements ServiceCustomers {

    @Autowired
    CustomerRepository repository;

    @Override
    public Flux<Customers> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Customers> save(Customers customers) {
        return repository.save(customers);
    }
}
