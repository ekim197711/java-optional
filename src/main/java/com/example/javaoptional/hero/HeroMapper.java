package com.example.javaoptional.hero;

import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Mapper(componentModel = "spring")
public interface HeroMapper {

    //    @Mapping(source = "rightHandEquipped", target = "rightHandEquipped", qualifiedByName = "wrap")
    HeroDto toDto(Hero hero);

    @Named("unwrap")
    default <T> T unwrap(Optional<T> optional) {
        return optional.orElse(null);
    }

    @Named("wrap")
    default Optional<String> wrap(String value) {
        return Optional.ofNullable(value);
    }
}
