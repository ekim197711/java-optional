package com.example.javaoptional.build;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/build")
public class BuildInfoRestController {

    private static final String GIT_FILE_NAME = "git.properties";

    @GetMapping("/info")
    public Map<Object, Object> buildInfo() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        try (InputStream inputStream = classLoader.getResourceAsStream(GIT_FILE_NAME)) {
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties.entrySet().stream().collect(
                    Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
