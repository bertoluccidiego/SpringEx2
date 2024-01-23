package main;

import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import models.Person;
import models.Parrot;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person's name is " + person.getName());
        System.out.println("Parrot's name is " + parrot.getName());
        System.out.println("Person's parrot is " + person.getParrot());
    }
}
