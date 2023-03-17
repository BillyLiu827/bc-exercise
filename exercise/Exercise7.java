import java.util.Arrays;
import java.util.concurrent.SubmissionPublisher;

import javax.swing.event.SwingPropertyChangeSupport;

/**
 * The sum is 55
 */
public class Exercise7 {
  // Sum values of an array
  public static void main(String[] args) {

    int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int sum = 0;

    for (int i =0; i<arr.length;i++){sum += arr[i];}

    System.out.println("The sum is " + sum );
  }
}