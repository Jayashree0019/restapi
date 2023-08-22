package com.mca.demo;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name="employees")
@Data             //automatically generate getter setter
public class Employee {
    @Column(name="first_name",nullable = false)
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="e_mail")
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
