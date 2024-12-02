package bai1_3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
