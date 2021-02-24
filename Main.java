import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of A cylinder ");
    int radius = sc.nextInt();

    System.out.println("Enter the height of A cylinder ");
    int height = sc.nextInt();

    Cylinder obj = new Cylinder(radius,height);
    System.out.println("Height of the cylinder = " + obj.area());
  }
}

class Circle {
  
  public int radius;
  Circle(int radius) {
    System.out.println("I am Circle Parameterized Constructor ");
    this.radius = radius;
  }

  public double area() {
    return Math.PI * radius*radius;
  }
}

class Cylinder extends Circle {

  public int height;

  Cylinder(int radius,int height) {
    super(radius);
    this.height = height;
    System.out.println("I am Cylinder Parameterized Constructor ");
  }

  public double area() {
    return Math.PI * radius*radius* height;
  }
}