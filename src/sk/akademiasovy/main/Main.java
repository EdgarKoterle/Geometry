package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Square;
import sk.akademiasovy.geometry.Rectangle;
import sk.akademiasovy.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square1=new Square(7.5);
        Square square2=new Square();

        System.out.println("Area of square1 is "+square1.getArea());
        System.out.println("Perimeter of square1 is "+square1.getPerimeter());
        System.out.println("Diagonal of square1 is "+square1.getDiagonal());

        Rectangle rectangle1=new Rectangle(8.5, 6.9);
        Rectangle rectangle2=new Rectangle();

        System.out.println("Area of rectangle1 is "+rectangle1.getArea());
        System.out.println("Perimeter of rectangle1 is "+rectangle1.getPerimeter());
        System.out.println("Diagonal of rectangle1 is "+rectangle1.getDiagonal());

        Triangle triangle1=new Triangle (3, 4, 5);
        Triangle triangle2=new Triangle ();

        System.out.println("Area of triangle1 is "+triangle1.getArea());
        System.out.println("Perimeter of triangle1 is "+triangle1.getPerimeter());
        System.out.println("Diagonal of triangle1 is "+triangle1.getDiagonal());
    }
}
