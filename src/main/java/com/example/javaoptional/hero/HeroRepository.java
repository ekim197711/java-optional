package com.example.javaoptional.hero;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HeroRepository extends JpaRepository<Hero, Long> {

    Optional<Hero> findByName(String name);
}
