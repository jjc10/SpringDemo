package com.example.spring_demo;

import com.example.spring_demo.model.musician.Musician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication implements CommandLineRunner {

	@Autowired
	private Musician onlyMusicianDefined;

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@Override
   public void run(String... strings) throws Exception {
		onlyMusicianDefined.instrumentsPlayed();
	}
}
