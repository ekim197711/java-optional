package com.example.javaoptional.hero;

import java.util.Optional;

record HeroDto(
        Long id,
        String name,
        Integer power,
        HeroLifePerspective perspective,
        Optional<String> rightHandEquipped) {
}
