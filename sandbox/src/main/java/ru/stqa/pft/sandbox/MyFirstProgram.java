package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Anna");

  }
  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

} 