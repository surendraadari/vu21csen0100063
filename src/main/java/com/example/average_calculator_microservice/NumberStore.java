package com.example.average_calculator_microservice;

import java.util.LinkedList;
import java.util.List;

import com.example.average_calculator_microservice.Number;

public class NumberStore {
    private final LinkedList<Number> numbers = new LinkedList<>();
    private final int windowSize;

    public NumberStore(int windowSize) {
        this.windowSize = windowSize;
    }

    public void addNumber(Number number) {
        if (numbers.size() >= windowSize) {
            numbers.poll(); // Remove the oldest number
        }
        numbers.add(number);
    }

    public double calculateAverage() {
        return numbers.stream().mapToInt(Number::getValue).average().orElse(0);
    }

    public List<Number> getNumbers() {
        return new LinkedList<>(numbers);
    }
}
