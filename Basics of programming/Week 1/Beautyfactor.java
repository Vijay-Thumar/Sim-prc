import java.util.*;
class Beautyfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long beautyFactor = sc.nextLong();
        long k = sc.nextLong();
        if ((beautyFactor > 0) && (beautyFactor < 10) && (k == 9)) {
            System.out.println("-1");
        }
        boolean find = true;
        for (long i = (long) Math.pow(10, k - 1); i <= (long) Math.pow(10, k) - 1; i++) {
            if ((beautyFactor(i) == beautyFactor) && (ifZeroPresent(i) == false) && (anyDigitRepeated(i) == false)) {
                find = false;
                System.out.println(i);
                break;
            }
        }
        if (find == true) {
            System.out.println("-1");
        }
    }
    private static long beautyFactor(long i) {
        if (i < 10) {
            return i;
        } else {
            return beautyFactor(sumOfDigits(i));
        }
    }
    private static long sumOfDigits(long i) {
        long totalSum = 0;
        while (i > 0) {
            totalSum += i % 10;
            i = i / 10;
        }
        return totalSum;
    }
    private static boolean anyDigitRepeated(long i) {
        long arr[] = new long[10];
        while (i != 0) {
            long rem = i % 10;
            arr[(int) rem]++;
            i = i / 10;
        }
        boolean repeated = false;
        for (long n = 0; n < 10; n++) {
            if (arr[(int) n] > 1) {
                repeated = true;
                break;
            }
        }
        return repeated;
    }

    private static boolean ifZeroPresent(long i) {
        int lastDigit = 0;
        while (i > 0) {
            lastDigit = (int)(i % 10);
            if (lastDigit == 0) {
                return true;
            }
            i = i / 10;
        }
        return false;
    }
}