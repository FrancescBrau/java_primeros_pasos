package com.javalessons.services;

import com.javalessons.model.person;

public class PersonaService implements IPerson {

    @Override
    public void register(person person) {
        System.out.println(person + "registred!");
    }

}
