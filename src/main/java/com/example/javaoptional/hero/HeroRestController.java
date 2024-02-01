package com.example.javaoptional.hero;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hero")
@RequiredArgsConstructor
public class HeroRestController {
    private final HeroService heroService;

    @PostMapping("/")
    Hero createHero(@RequestBody String name) {
        return heroService.createHero(name);
    }

    @GetMapping("/random")
    Hero randomHero() {
        return heroService.randomHero();
    }

    @GetMapping("/randomDto")
    HeroDto randomHeroDto() {
        return heroService.randomHeroDto();
    }
}
