package arrays;

import javax.swing.*;
import java.util.Scanner;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Java Questions
 * Package - arrays
 * Created_on - June 25 - 2024
 * Created_at - 13:25
 * Solution - https://www.youtube.com/watch?v=BzJK1zNXwcU&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=100
 */

public class SumOfTwoArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int al1 = sc.nextInt();
        int[] a1 = new int[al1];
        for (int i=0 ; i<a1.length ; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println("A1 Filled");

        int al2 = sc.nextInt();
        int[] a2 = new int[al2];
        for (int i=0 ; i<a2.length ; i++) {
            a2[i] = sc.nextInt();
        }
        System.out.println("A2 Filled");

        int[] sum = new int[Math.max(al1, al2)];
        int carry = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        while(k >= 0) {
            int d = carry;
            if (i >= 0) {
                d += a1[i];
            }
            if (j >= 0) {
                d+= a2[j];
            }
            carry = d/10;
            d = d%10;
            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if (carry!=0) {
            System.out.print(carry);
        }
        for (int a : sum) {
            System.out.print(a);
        }
    }
}
