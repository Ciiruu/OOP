package PBO.OOP.flow_control;

import java.util.Scanner;

public class TugasNO2 {
  public static void main(String[] args) {
    System.out.println("==== Jarak Manhattan ====");
    int a, b;
    Scanner input = new Scanner(System.in);
    int x1 = input.nextInt();
    int y1 = input.nextInt();
    int x2 = input.nextInt();
    int y2 = input.nextInt();
    input.close();
    a = x1 - x2;
    b = y1 - y2;
    if (a < 0 && b < 0) {
      System.out.println(-1 * a + -1 * b);
    } else if (a < 0 && b > 0) {
      System.out.println(-1 * a + b);
    } else if (a > 0 && b < 0) {
      System.out.println(a + -1 * b);
    } else if (a > 0 && b > 0) {
      System.out.println(a + b);
    } else {
      if (a == 0) {
        if (b < 0) {
          System.out.println(-1 * b);
        } else {
          System.out.println(b);
        }
      } else if (b == 0) {
        if (a < 0) {
          System.out.println(-1 * a);
        } else {
          System.out.println(a);
        }
      }
    }
  }
}
