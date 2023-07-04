public class Circle {
    private int x;
    private int y;
    private double radius;

    public Circle() {

    }

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getArea() {
        double result = Math.PI * Math.pow(radius, 2);
        return (int) result;
    }
}
