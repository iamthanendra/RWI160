class AreaCalculator {
    // Method to calculate the area of a square
    public double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a triangle
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate and print the areas using method overloading
        System.out.println("Area of Square: " + calculator.calculateArea(5.0));
        System.out.println("Area of Triangle: " + calculator.calculateArea(4.0, 3.0));
        System.out.println("Area of Rectangle: " + calculator.calculateArea(6.0, 4.0));
    }
}