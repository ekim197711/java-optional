package com.example.javaoptional.hero;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class HeroRepositoryTest {

    @Autowired
    HeroRepository heroRepository;
    @Autowired
    HeroMapper heroMapper;

    @Test
    void listAll() {
        heroRepository.findAll().forEach(System.out::println);

        heroRepository.findByName("The Mummy")
                .ifPresentOrElse(
                        (h) -> System.out.println("Hero found!"),
                        () -> System.out.println("Hmmm where is the hero...")
                );
    }

}