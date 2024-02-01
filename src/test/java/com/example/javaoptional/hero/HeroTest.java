package com.example.javaoptional.hero;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

class HeroTest {
    List<Hero> heroes() {
        return List.of(
                Hero.builder().name("Zorro").perspective(HeroLifePerspective.GOOD)
                        .rightHandEquipped("Sword").power(6)
                        .build()
        );
    }

    Hero hero() {
        return Hero.builder().name("Zorro").perspective(HeroLifePerspective.GOOD)
                .rightHandEquipped("Sword").power(6)
                .build();
    }

    Hero monster() {
        return Hero.builder().name("Frankenstein's Monster").perspective(HeroLifePerspective.GOOD)
                .rightHandEquipped(null).power(3)
                .build();
    }

    @Test
    void testHeroes() {
        Map<HeroLifePerspective, Hero> heroesByPerspective = new HashMap<>();
        heroesByPerspective.put(null, hero());
        heroesByPerspective.put(HeroLifePerspective.GOOD, hero());

        Hero myhero = heroesByPerspective.getOrDefault(HeroLifePerspective.GOOD, monster());
        System.out.println("My Hero " + myhero);

    }

    @Test
    void testList() {

        printOutHeroes(List.of());
        printOutHeroes(heroes());
    }

    void printOutHeroes(List<Hero> heroes) {
        if (heroes.isEmpty()) {
            System.out.println("no heroes where provided");
        } else {
            heroes.forEach(System.out::println);
        }
    }

    void printOutOneHeroe(Hero hero) {
        Optional.ofNullable(hero).ifPresentOrElse(
                System.out::println, () -> System.out.println("blabla no hero provided")
        );
    }

    @Test
    void testOneHero() {
        printOutOneHeroe(null);
        printOutOneHeroe(hero());
    }


}