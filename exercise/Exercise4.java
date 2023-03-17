import java.util.concurrent.CountDownLatch;

public class Exercise4 {
  /**
   * Exercise: Print first 10 natural numbers, but skip 6
   */
  /**
   * Expected Output:
   * The first 10 natural numbers are, except 6:
   * 1234578910
   */
  public static void main(String[] args) {

    System.out.println("The first 10 natural numbers are, except 6:");

    int i;

    for (i = 1; i <= 10; i++) {
      if (i != 6) {
        System.out.print(i);
      }
    }
  }
}