package com.javalessons;
import com.javalessons.model.person;
import com.javalessons.services.IPersonaService;
import com.javalessons.services.PersonaServiceImpl;

public class App {
    public static void main(String[] args) {
        System.out.print("Hola mundo!!");
         person pers1 = new person(1, "Pepe");
        IPersonaService persService = new PersonaServiceImpl();
        persService.register(pers1); 
    }
}