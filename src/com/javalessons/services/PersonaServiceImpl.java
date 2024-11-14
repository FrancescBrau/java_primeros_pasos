package com.javalessons.services;

import com.javalessons.model.person;

public class PersonaServiceImpl implements IPersonaService {

    @Override
    public void register(person person) {
        System.out.println(person + "registred!");
    }

}
