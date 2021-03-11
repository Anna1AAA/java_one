package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Anna");

    double i = 5;
    System.out.println("Площадь квадрата со стороной " + i + " = " + area(i));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }
  public static double area(double l) {
    return l*l;
  }
}