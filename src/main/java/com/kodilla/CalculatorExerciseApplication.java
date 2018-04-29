package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorExerciseApplication {

    public static void main(String[] args) {

        Calculator simpleCalc = new Calculator();

        int result1 = simpleCalc.addAToB(28, 6);
        System.out.println("Result of operation add A to B: "+result1);

        int result2 = simpleCalc.substractAFromB(56, 78);
        System.out.println("Result of operation substract A from B: " + result2);
    }
}
