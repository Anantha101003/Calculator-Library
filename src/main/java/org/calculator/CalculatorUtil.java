package org.calculator;

public class CalculatorUtil {

    public static BasicCalculator getBasicCalculatorInstance() {
        return new BasicCalculatorImpl();
    }
    public static ScientificCalculator getScientificCalculatorIns(){
        return new ScientificCalculatorImpl();
    }
}

