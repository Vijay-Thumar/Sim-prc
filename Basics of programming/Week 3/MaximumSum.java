import java.util.Scanner;

public class MaximumSum {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int i = s.nextInt(), elements = 0;
    long sum = 0, highestNumber = Long.MIN_VALUE;
    int[] ints = new int[i];
    while (i-- != 0)
      ints[i] = s.nextInt();

    for (int anInt : ints) {
      if (anInt > highestNumber)
        highestNumber = anInt;

      if (anInt < 0)
        continue;
      sum += anInt;
      elements++;
    }
    if (sum == 0) {
      sum = highestNumber;
      elements = 1;
    }

    System.out.println(sum + " " + elements);
  }
}