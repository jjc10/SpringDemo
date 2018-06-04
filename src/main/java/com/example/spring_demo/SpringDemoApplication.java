package com.example.spring_demo;

import com.example.spring_demo.model.musician.Musician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication implements CommandLineRunner {

    /*  Spring looks for a bean of type musician defined anywhere in the project. If there is no confusion (more than one bean of that type)
        it will be injected inside our class here, we can readily use it without having to instantiate it! Our system is therefore decoupled:
        the current class doesn't have to worry about configuring musicians.

        Autowiring is first done by type. When there is conflict (more than one bean of type musician defined), you can resolve the conflict
        by using the @Qualifier annotation which allows you to reference a specific bean. Think of it as an id.

        In the absence of an explicit qualifier annotation, Spring will try to resolve the conflict by treating the bean's name as a qualifier.
    */

    // We have multiple beans of type Musician, so autowiring by type is not sufficient. Use qualifier to refer to a specific bean
    @Autowired
    @Qualifier(value = "esbjornSvensson")
    private Musician esbjorn;


    // We have multiple beans of type Musician, autowiring by type is not sufficient. Not qualifier annotation so Spring tries to
    // resolve the conflict by treating the name of the bean as the qualifier.
    @Autowired
    private Musician frankZappa;

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        frankZappa.instrumentsPlayed();
    }
}
