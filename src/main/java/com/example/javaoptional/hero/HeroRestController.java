package com.example.javaoptional.hero;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/hero")
public class HeroRestController {

    @PostMapping("/")
    Hero createHero(String name) {
        Optional.ofNullable(name).ifPresentOrElse((n) -> {
            System.out.println("Name is present: " + n);
        }, () -> System.out.println("Whinee waah wah no name was provided"));

        return Hero.builder()
                .name(Optional.ofNullable(name).orElse("Alice"))
                .power(10)
                .perspective(HeroLifePerspective.GOOD)
                .build();
    }
}
