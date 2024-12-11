package org.calculator;

/**
 * Hello world!
 */
class BasicCalculatorImpl implements BasicCalculator {

    public String sayHello() {
        return "Hello World";
    }


    public int addNumbers (int...nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }

    public int subtractNumbers (int...nums) {
        int result = 0;
        for (int num : nums) {
            result -= num;
        }
        return result;
    }

    public long multiplyNumbers (int...nums) {
        long result = 1;
        for (int num : nums) {
            result *= num;
        }
        return result;
    }

    public double divideNumbers (int x, int y) {
        return (double) x /y;
    }

}


class ScientificCalculatorImpl implements ScientificCalculator{

    public double calculateSine(double radians) {
        return Math.sin(radians);
    }
}
