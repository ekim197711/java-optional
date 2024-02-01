package com.example.javaoptional.hero;

import org.junit.jupiter.api.Test;

class HeroRestControllerTest {

    @Test
    void createHero() {
        HeroRestController heroRestController = new HeroRestController();
        Hero hero1 = heroRestController.createHero(null);

        Hero hero2 = heroRestController.createHero("Mike");
    }
}