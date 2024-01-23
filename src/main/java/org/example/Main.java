package org.example;

import org.example.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.models.Person;
import org.example.models.Parrot;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Person person = context.getBean(Person.class);

        System.out.println("Person's name is " + person.getName());
        System.out.println("Person's parrot is " + person.getParrot().getName());
    }
}
