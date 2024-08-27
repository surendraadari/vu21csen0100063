package com.example.average_calculator_microservice;

import java.util.List;
import java.util.Random;

public class NumberGenerator {
    private static final Random random = new Random();

    public static List<Number> fetchNumbers() {
        // Simulate fetching numbers from an API
        return List.of(
            new Number(random.nextInt(100), NumberType.RANDOM),
            new Number(random.nextInt(100), NumberType.RANDOM),
            new Number(random.nextInt(100), NumberType.RANDOM),
            new Number(random.nextInt(100), NumberType.RANDOM)
        );
    }
}
