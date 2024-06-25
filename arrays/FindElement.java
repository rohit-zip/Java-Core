package arrays;

import java.util.Scanner;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Java Questions
 * Package - arrays
 * Created_on - June 25 - 2024
 * Created_at - 13:05
 * Solution - https://www.youtube.com/watch?v=3AcyounXhfg&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=96&pp=iAQB
 */

public class FindElement {

    public static int findElement(int[] array, int target) {
        for (int i=0 ; i<array.length ; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i=0 ; i<array.length ; i++){
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(findElement(array, target));
    }
}
