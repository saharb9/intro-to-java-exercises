/*
  Write a program that displays all the numbers from 100 to 1000, ten per line,
  that are divisible by 5 or 6. Numbers are separated by exactly one space.
*/

public class E5_10 {
  public static void main(String[] args) {
    int count = 0;
    for (int i = 100; i <= 1000; i++) {
      if (i % 5 == 0 || i % 6 == 0) {
        if (count == 10) {
          System.out.println();
          count = 0;
        }
        System.out.print(i + " ");
        count++;
      }
    }
    System.out.println();
  }
}
