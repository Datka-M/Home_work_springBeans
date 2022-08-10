package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("person",Person.class);
        person.chooseAnimal(person);
        System.out.println("-----------------------------------");

        context.close();
    }
}
