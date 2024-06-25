package arrays;

import java.util.Scanner;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Java Questions
 * Package - arrays
 * Created_on - June 25 - 2024
 * Created_at - 13:12
 * Solution - https://www.youtube.com/watch?v=L-0IxqvYQKs&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=98
 */

public class BarChart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i=0 ; i<n ; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i=1 ; i<array.length ; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i=max ; i>=1 ; i--) {
            for (int j=0 ; j<array.length ; j++) {
                if (array[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
