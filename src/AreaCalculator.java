public class AreaCalculator {
    public double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        
        double circleArea = Math.PI * Math.pow(radius, 2);
        return circleArea;
    }

    // Overloaded method
    public double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        double rectangleArea = x * y;
        return rectangleArea;
    }
}
