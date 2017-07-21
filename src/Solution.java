import java.util.Scanner;

public class Solution {

    static String onceInATram(int x) {

        int first = (x / 1000);
        int second = (x % 1000);

        int increment = second;

        int sumFirst = sumOf(first);
        int sumSecond = sumOf(second);

        if (sumFirst == sumSecond) {
            second++;
            while (sumOf(second) != sumFirst) {
                second++;
            }
        } else {
            while (sumOf(second) != sumFirst) {
                second++;
            }
        }

        return String.valueOf(first + "" + second);
    }

    public static int sumOf(int x) {
        int sum = 0;
        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}
