package com.example.Customers.Service;

import com.example.Customers.Model.Customers;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServiceCustomers {

Flux<Customers> findAll();
Mono<Customers> save(Customers customers);

}