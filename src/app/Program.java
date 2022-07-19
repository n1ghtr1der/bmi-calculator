package app;

import entities.Calculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner receiver = new Scanner(System.in);
        Calculator calculateBMI = new Calculator();

        System.out.print("Insert your weigth in kilograms.");
        calculateBMI.weight = receiver.nextDouble();
        System.out.println("Insert your height in meters and centimeters");
        calculateBMI.height = receiver.nextDouble();

        double bmi = calculateBMI.bmiCalc();
        System.out.printf("Your BMI is: %.2f kg/m2", bmi);

        String bmiGroup = calculateBMI.bmiGroup(bmi);
        System.out.println(bmiGroup);
    }
}
