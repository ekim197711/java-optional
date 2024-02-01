package com.example.javaoptional.hero;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class HeroService {

    private final HeroRepository heroRepository;
    private final HeroMapper heroMapper;


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


    Hero randomHero() {
        Optional<Hero> byId = heroRepository.findById(Long.parseLong("" + new Random().nextInt() % 50));
        return byId.orElseThrow();
    }


    HeroDto randomHeroDto() {
        Long id = Long.parseLong("" + (Math.abs(new Random().nextInt() % 50) + 1));
        System.out.println("id " + id);
        Optional<Hero> byId = heroRepository.findById(id);
        return heroMapper.toDto(byId.orElseThrow());
    }
}
