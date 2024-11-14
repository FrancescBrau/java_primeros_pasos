package com.javalessons;
import com.javalessons.model.person;
import com.javalessons.services.IPersonaService;
import com.javalessons.services.PersonaServiceImpl;

public class App {
    public static void main(String[] args) {
        extracted();
         IPersonaService persService = new PersonaServiceImpl();
        persService.register(new person(1, "Pepe")); 
    }

    private static void extracted() {
        System.out.print("Hola mundo!!");
        int i=9;
        calculator(i);
    }

    private static void calculator(int i) {
        System.out.println(i*9);
    }
}
