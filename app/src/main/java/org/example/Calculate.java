package org.example;

public class Calculate {
  public static void main(String[] args) {
    // Hello World
    System.out.println("Hello World!");

    // Sum and average of 2 and 3
    int sum1 = sum(2, 3);
    double avg1 = average(2, 3);
    System.out.println("Sum of 2 and 3 is " + sum1 + ". Average is " + avg1 + ".");

    // Sum and average of 1 to 10
    int sum2 = sumRange(1, 10);
    double avg2 = averageRange(1, 10);
    System.out.println("Sum of 1 to 10 is " + sum2 + ". Average is " + avg2 + ".");

    // Sum of odd and even numbers from 1 to 10
    int sumOdd = sumOddRange(1, 10);
    int sumEven = sumEvenRange(1, 10);
    System.out.println("Sum of odd of 1 to 10 is " + sumOdd + ". Sum of even is " + sumEven + ".");
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public static double average(int x, int y) {
    return (x + y) / 2.0;
  }

  public static int sumRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public static double averageRange(int start, int end) {
    return sumRange(start, end) / (double) (end - start + 1);
  }

  public static int sumOddRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static int sumEvenRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
