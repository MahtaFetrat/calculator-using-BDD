package calculator;

public class Calculator {
    public double operate(double a, double b, String operation) throws Exception {
        if (operation.equals("*")) return mult(a, b);
        if (operation.equals("/")) return div(a, b);
        if (operation.equals("^")) return  pow(a, b);
        else throw new Exception("Invalid Operation");
    }
    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) return Double.MAX_VALUE;
        return a / b;
    }

    public double pow(double a, double b) {
        double base = (b >= 0 ? a :  (double) 1 / a);
        b = Math.abs(b);
        double result = 1;
        for (int i = 0; i < b; i ++) {
            result = mult(result, base);
        }
        return result;
    }
}
