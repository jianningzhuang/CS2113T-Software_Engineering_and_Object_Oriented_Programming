public class Main {

    public static void printObjects(Printable[] items) {
        for (Printable p : items) {
            p.print();
        }
    }

    public static void main(String[] args) {
        Printable[] printableItems = new Printable[]{
                new Circle(5),
                new Rectangle(3, 4),
                new Person("James Cook")};

        printObjects(printableItems);
    }
}

public interface Printable{
  public void print();
}

public abstract class Shape {

    public abstract int area();
}

public class Rectangle extends Shape implements Printable {
    private int height;
    private int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public int area() {
        return height * width;
    }

    @Override
    public void print() {
        System.out.println("Rectangle of area " + area());
    }
}

public class Person implements Printable {

    private String name;

    public Person(String name){
      this.name = name;
    }

    @Override
    public void print(){
      System.out.println("Person of name " + this.name);
    }
}

public class Circle extends Shape implements Printable {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int)(Math.PI * radius * radius);
    }

    @Override
    public void print() {
        System.out.println("Circle of area " + area());
    }
}
