package com.example.javaoptional.hero;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component
@RequiredArgsConstructor
public class HeroGenerator {

    private final HeroRepository heroRepository;

    @PostConstruct
    void createHeros() {
        List<Hero> heroes = Stream.of(
                "Headless Horseman",
                "Esau Cairn",
                "Abraham Van Helsing",
                "Ares",
                "Abdul Alhazred",
                "C. Auguste Dupin",
                "Ayesha",
                "Aladdin",
                "Barbarella",
                "Buddy",
                "Beowulf",
                "Bride of Frankenstein",
                "Captain Ahab",
                "Creature from the Black Lagoon",
                "Cyclone",
                "Dorian Gray",
                "Dagar, Desert Hawk",
                "Don Quixote",
                "Ebenezer Scrooge",
                "Gulliver",
                "Grendel",
                "Green Giant",
                "Grendel's Mother",
                "D'Artagnan",
                "Huckleberry Finn",
                "Aramis",
                "Porthos",
                "James Moriarty",
                "Judy of the Jungle",
                "Loch Ness Monster",
                "Moon Girl",
                "Magno",
                "Hugo Danner",
                "Green Lama",
                "Fighting Yank",
                "Octobriana",
                "Odysseus",
                "Scheherazade",
                "Red Riding Hood",
                "Rapunzel",
                "Rumpelstiltskin",
                "Rosie The Riveter",
                "Rocketgirl",
                "She",
                "The Yellow Kid",
                "The Wolf Man",
                "Thor",
                "The Pied Piper",
                "The Mummy",
                "Tom Sawyer",
                "The Time Traveller"
        ).map(s -> Hero.builder().name(s).power(s.length())
                .id(null)
                .rightHandEquipped("Fishing rod")
                .perspective(
                        HeroLifePerspective.values()[s.length() % HeroLifePerspective.values().length]
                )
                .build()
        ).toList();
        heroRepository.saveAll(heroes);
        heroRepository.findAll().forEach(System.out::println);
    }
}


//                1. Robin Hood
//
//                        2. Zorro
//
//                        3. Dracula
//
//                        4. Sherlock Holmes
//
//                        5. John Carter
//
//                        6. Frankenstein's Monster
//
//                        7. Scarecrow
//
//                        8. Dorothy Gale
//
//                        9. Tin Woodman
//
//                        10. Cowardly Lion
//
//                        11. The Hunchback of Notre Dame
//
//                        12. King Kong
//
//                        13. Ivanhoe
//
//                        14. Alice
//
//                        15. Jack Pumpkinhead
//
//                        16. Gravestone
//
//                        17. Doodle
//
//                        18. Man of War
//
//                        19. Dr. Jekyll/Mr. Hyde
//
//                        20. Cthulhu
//
//                        21. Hercules
//
//                        22. Natty Bumppo
//
//                        23. White Rabbit
//
//                        24. Paul Bunyan
//
//                        25. Long John Silver
//
//                        26. Wizard Of Oz
//
//                        27. Firehair
//
//                        28. Captain Nemo
//
//                        29. King Arthur
//
//                        30. Woggle-Bug
//
//                        31. Mystico
//
//                        32. Cheshire Cat
//
//                        33. Wilhelmina Murray
//
//                        34. Queen Of Hearts
//
//                        35. Brad Spencer, Wonderman
//
//                        36. Mad Hatter
//
//                        37. Achilles
//
//                        38. Nyarlathotep
//
//                        39. Red Comet
//
//                        40. Allan Quatermain
//
//                        41. Atoman
//
//                        42. Helen of Troy
//
//                        43. Mouthpiece
//
//                        44. Moby Dick
//
//                        45. Wicked Witch of the West
//
//                        46. Victor Frankenstein
//
//                        47. Sinbad
//
//                        48. The Sphinx
