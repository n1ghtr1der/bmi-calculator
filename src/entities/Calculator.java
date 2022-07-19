package entities;

import app.Program;

public class Calculator {
    public double height, weight;

    public double bmiCalc() {
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }

    public String bmiGroup(double bmi) {
        String groupResponse;
        if (bmi < 18.5) {
            groupResponse = "You are underweight.";
        } else if (bmi > 18.5 && bmi < 24.9) {
            groupResponse = "You are in the ideal BMI range.";
        } else if (bmi > 25 && bmi < 29.9) {
            groupResponse = "You are overweight.";
        } else if (bmi > 30 && bmi < 34.9) {
            groupResponse = "You are in obesity level 1.";
        } else if (bmi > 35 && bmi < 39.9) {
            groupResponse = "You are in obesity level 2.";
        } else {
            groupResponse = "You are in obesity level 3.";
        }
        return groupResponse;
    }

}
