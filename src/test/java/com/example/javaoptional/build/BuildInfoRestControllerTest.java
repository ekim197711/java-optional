package com.example.javaoptional.build;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class BuildInfoRestControllerTest {

    @Test
    public void buildInfo() {
        Map<Object, Object> buildInfo =
                new BuildInfoRestController().buildInfo();
        System.out.println(buildInfo);
        Assertions.assertThat(buildInfo).containsKey("git.branch");
    }
}