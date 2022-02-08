package com.example.Customers.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Customers")
public class Customers {
    @Id
    private String id;
    private String Name;
    private String Number;
    private String Type;
}
