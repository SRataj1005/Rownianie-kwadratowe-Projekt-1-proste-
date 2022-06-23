import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) 
  {
  Scanner nowy = new Scanner(System.in);
  System.out.println("Podaj a: ");
  double a = nowy.nextDouble();
  System.out.println("Podaj b: ");
  double b = nowy.nextDouble();
  System.out.println("Podaj c: ");
  double c = nowy.nextDouble();
  System.out.println("y = " + a + "x^2 + " + b + "x + " +c);
  double delta = b * b - 4 * a * c;
  System.out.println();
  System.out.println("Delta = " + delta);
 
  if(delta == 0)
  {
    double x0 = -b/(2*a);
  System.out.println("x0 = " + x0);
  }
  if(delta > 0)
  {
    double x1 = (-b - Math.sqrt(delta))/(2 * a);
    double x2 = (-b + Math.sqrt(delta))/(2 * a);
    System.out.println("x1 = " + x1 + "\nx2 = " + x2);
  }
  else
  {
    System.out.println("Delta jest ujemna - brak rozwiązania");
  }
  
  }
}