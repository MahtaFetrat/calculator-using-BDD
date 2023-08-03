package calculator;

public class Calculator {
    public double mult(double a, double b) {
        return a * b;
    }

    public double div(int a, int b) {
        if (b == 0) return Double.MAX_VALUE;
        return (double) a / b;
    }

    public double pow(int a, int b) {
        double base = (b >= 0 ? (double) a :  (double) 1 / a);
        b = Math.abs(b);
        double result = 1;
        for (int i = 0; i < b; i ++) {
            result = mult(result, base);
        }
        return result;
    }
}
