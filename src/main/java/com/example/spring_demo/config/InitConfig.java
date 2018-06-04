package com.example.spring_demo.config;

import com.example.spring_demo.model.instrument.Guitar;
import com.example.spring_demo.model.musician.Musician;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Definition of what Configuration does from Spring's doc. When in doubt, read the doc:
 * <p>
 * Indicates that a class declares one or more {@link Bean @Bean} methods and
 * may be processed by the Spring container to generate bean definitions and
 * service requests for those beans at runtime.
 * <p>
 * What this means is that a class annotated with Configuration is a class where you will find bean definitions.
 * That is, in this class, we configure our objects (beans) that are managed by the spring framework. Those objects can
 * thus be accessed by other classes that express a dependency to them. The framework will wire them together magically
 * As a result, you don't have to create those objects in each class that needs them.
 */

@Configuration
public class InitConfig {


    // This method creates a bean of type musician. This particular instance's name is Frank Zappa, he plays prog rock and was born in 1940.
    @Bean
    public Musician frankZappa(Guitar gibsonSG) {
        Musician fz = new Musician("Frank Zappa", "Prog rock", 1940);
        fz.getInstruments().add(gibsonSG);
        return fz;
    }

    @Bean
    @Qualifier(value = "esbjornSvensson")
    public Musician someJazzMusician() {
        Musician fz = new Musician("Esbjorn Svensson", "Jazz", 1964);
        return fz;
    }

    // This method creates a bean of type Guitar. This particular instance is a Gibson SG.
    @Bean
    public Guitar gibsonSG() {
        Guitar sg = new Guitar(4000, "Gibson", "SG");
        return sg;
    }

    @Bean
    public Guitar fenderStrat() {
        Guitar sg = new Guitar(3000, "Fender", "Strat");
        return sg;
    }


}
