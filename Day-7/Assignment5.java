 class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        double squareArea = calculator.calculateArea(4.0);
        double rectangleArea = calculator.calculateArea(3.0, 5.0);

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}

class ShapeCalculator {
    // Calculate the area of a square
    double calculateArea(double sideLength) {
        return sideLength * sideLength;
    }

    // Calculate the area of a rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

}

