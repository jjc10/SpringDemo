package com.example.spring_demo.dao;

import com.example.spring_demo.model.instrument.Instrument;
import com.example.spring_demo.model.musician.Musician;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/*
A DAO (data access object) is an object in an application that provides an abstract interface to accessing the persistence layer (a database).
Here, we just hardcode a list of musicians.
 */
@Repository
public class LibraryDao {

    private List<Musician> musicians;

    public LibraryDao() {
        musicians = new ArrayList<>();
    }

    /*
    Post construct defines a method that runs right after the bean is initialized. We initialize it above with an empty list (@Repository is what causes it to be registered as a bean.
    Here we add a few musicians.
    */
    @PostConstruct
    public void populateLibrary() {
        Musician shakira = new Musician("Shakira", "pop", 1977);
        Musician avishai = new Musician("Avishai Cohen", "jazz", 1970);
        avishai.getInstruments().add(new Instrument("string", "double bass", 10000));
        musicians.add(shakira);
        musicians.add(avishai);
    }

    public List<Musician> getMusicians() {
        return musicians;
    }
}
