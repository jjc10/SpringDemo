package com.example.spring_demo.controller;

import com.example.spring_demo.model.musician.Musician;
import com.example.spring_demo.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller // Tells Spring this class is a special bean (component) that accepts http requests.
public class TestController {

    // Attribute injection
    @Autowired
    private LibraryService libraryService;

    @RequestMapping(method = RequestMethod.GET, path = "/ok") // Spring maps this path to this method for you!
    public ResponseEntity<String> returnOk() {
        return new ResponseEntity<>("Ok les champions!", HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/musicians")
    public ResponseEntity<List<Musician>> getMusicians() {
        return new ResponseEntity<>(libraryService.getMusicians(), HttpStatus.OK);
    }
}
