package com.example.javaoptional.hero;

record HeroDto(
        Long id,
        String name,
        Integer power,
        HeroLifePerspective perspective,
        String rightHandEquipped) {
}
