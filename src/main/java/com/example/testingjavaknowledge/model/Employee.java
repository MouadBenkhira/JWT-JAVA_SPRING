package com.example.testingjavaknowledge.model;

import com.example.testingjavaknowledge.model.abstractClass.AbstractClass;
import com.example.testingjavaknowledge.model.enums.EmployeeStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.SoftDelete;

import java.util.UUID;

@Entity
@Table(name = "employees")
@Data
@SoftDelete
public class Employee extends AbstractClass {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    String firstName;
    String lastName;
    String email;
    String phone;
    String address;
    String city;
    EmployeeStatus status;
}


