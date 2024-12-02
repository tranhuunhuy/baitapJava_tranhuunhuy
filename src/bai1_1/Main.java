package bai1_1;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());

        Circle circle2 = new Circle(2.5);
        System.out.println(circle2.toString());

        Circle circle3 = new Circle(3, "blue");
        System.out.println(circle3.toString());

        System.out.println("Area of circle3: " + circle3.getArea());
    }
}