package ex_4_33;

public class Square extends Shape implements Comparable<Shape> {
    private double height;
    private double width;

    public Square(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return (height * 2) + (width * 2);
    }

    @Override
    public int compareTo(Shape o) {
        if(o instanceof Square) {
            return Double.compare(area(), o.area());
        }

        return 0;
    }
}
