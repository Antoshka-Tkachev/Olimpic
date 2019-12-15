package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long n, m, t;
	    Scanner in = new Scanner(System.in);
        n = in.nextLong();
        m = in.nextLong();
        t = in.nextLong();


        int count = 0;

        if (n * m  - 1 == t && m == n) {
            if (n % 2 == 0)
                System.out.println(n / 2 - 1);
            else
                System.out.println(n / 2);
            return;
        }
        while (2 * n  + 2 * (m - 2) <= t) {
            count++;
            t -= 2 * n  + 2 * (m - 2);
            n -= 2;
            m -= 2;
        }

        System.out.println(count);
    }
}
