package com.spring.petclinic.modal;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
}
