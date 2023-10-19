class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class TestPolymorphism2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(5, 3);
        double result2 = calculator.add(2.5, 3.2);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
