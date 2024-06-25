package arrays;

import java.util.Scanner;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Java Questions
 * Package - arrays
 * Created_on - June 25 - 2024
 * Created_at - 12:55
 * Video - https://www.youtube.com/watch?v=1SsXm5TI8W4&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=94
 */

public class ArraySpan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i=0 ; i<n ; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];
        for (int a : array) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        int span = max - min;
        System.out.println(span);
    }
}
