package com.example.Customers.Repository;

import com.example.Customers.Model.Customers;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends ReactiveMongoRepository<Customers,String> {
}
