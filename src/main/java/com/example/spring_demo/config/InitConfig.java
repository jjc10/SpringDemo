package com.example.spring_demo.config;

import com.example.spring_demo.model.instrument.Guitar;
import com.example.spring_demo.model.instrument.Instrument;
import com.example.spring_demo.model.musician.Musician;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition of what Configuration does from Spring's doc. When in doubt, read the doc:
 *
 * Indicates that a class declares one or more {@link Bean @Bean} methods and
 * may be processed by the Spring container to generate bean definitions and
 * service requests for those beans at runtime.
 *
 * What this means is that a class annotated with Configuration is a class where you will find bean definitions.
 * That is, in this class, we configure our objects (beans) that are managed by the spring framework. Those objects can
 * thus be accessed by other classes that express a dependency to them. The framework will wire them together magically
 * As a result, you don't have to create those objects in each class that needs them.
 */

@Configuration
public class InitConfig {


    // This method creates a bean of type musician.
    @Bean
    @DependsOn(value = "gibsonSG")
    public Musician frankZappa() {
        Musician fz = new Musician("Frank Zappa", "Prog rock", 1940);
        fz.getInstruments().add(gibsonSG());
        return fz;
    }

    @Bean(value = "gibsonSG")
    public Guitar gibsonSG() {
        Guitar sg = new Guitar(4000, "Gibson", "SG");
        return sg;
    }


}
