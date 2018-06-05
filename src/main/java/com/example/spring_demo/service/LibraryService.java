package com.example.spring_demo.service;

import com.example.spring_demo.dao.LibraryDao;
import com.example.spring_demo.model.musician.Musician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    private LibraryDao libraryDao;

    @Autowired
    public LibraryService(LibraryDao libraryDao) {
        this.libraryDao = libraryDao;
    }

    public List<Musician> getMusicians() {
        return libraryDao.getMusicians();
    }
}
