package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Square;

public class Main {
    public static void main(String[] args) {
        Square square1=new Square(7.5);
        Square square2=new Square();

        System.out.println("Area of square1 is "+square1.getArea());
        System.out.println("Perimeter of square1 is "+square1.getPerimeter());
        System.out.println("Diagonal of square1 is "+square1.getDiagonal());
    }
}
