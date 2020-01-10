package com.kodilla.parametrized_tests.homework;

public class Person {

    private double heightInMeters;
    private double weightInKilogram;


    public Person(double heightInMeters, double weightInKilogram) {
        this.heightInMeters = heightInMeters;
        this.weightInKilogram = weightInKilogram;

    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public  double getWeightInKilogram() {
        return weightInKilogram;
    }

    private double countBmi() {
        return Math.round(getWeightInKilogram() / (getHeightInMeters() * getHeightInMeters()));
    }

    enum Bmi {
        Z(60.00, 100.99),
        A(50.0, 59.99),
        B(45.0, 49.99),
        C(40.0, 44.99),
        D(35.0, 39.99),
        E(30.0, 34.99),
        F(25.0, 29.99),
        G(18.50, 24.99),
        H(16.0, 18.49),
        I(15.0, 15.99),
        J(0.0, 14.99);
        private double from;
        private double to;

        Bmi(double from, double to) {
            this.from = from;
            this.to = to;
        }


        boolean inRange(double bmiValue) {
            return bmiValue >= from && bmiValue <= to;
        }

        public static Bmi getRange(double bmiValue) {
            for (Bmi bmi: Bmi.values()) {
                if (bmi.inRange(bmiValue))
                    return bmi;
            }
            return Z;
        }

    }

    public String getBMI() {
        double bmiValue = this.countBmi();
        Bmi bmi = Bmi.getRange(bmiValue);
        switch (bmi) {
            case J:
                return "Very severely underweight";
            case I:
                return "Severely underweight";
            case H:
                return "Underweight";
            case G:
                return "Normal (healthy weight)";
            case F:
                return "Overweight";
            case E:
                return "Obese Class I (Moderately obese)";
            case D:
                return "Obese Class II (Severely obese)";
            case C:
                return "Obese Class III (Very severely obese)";
            case B:
                return "Obese Class IV (Morbidly Obese)";
            case A:
                return "Obese Class V (Super Obese)";
            default:
                return "Obese Class VI (Hyper Obese)";
        }
    }
}