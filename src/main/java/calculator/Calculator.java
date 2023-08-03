package calculator;

public class Calculator {
    public double mult(double a, double b) {
        return a * b;
    }

    public double div(int a, int b) {
        if (b == 0) return Double.MAX_VALUE;
        return (double) a / b;
    }
}
