package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        short a, b, n, m;
        int timeFirst, timeSecond;
	    Scanner in = new Scanner(System.in);
	    a = in.nextShort();
        b = in.nextShort();
        n = in.nextShort();
        m = in.nextShort();

        timeFirst = a * n + (n - 1);
        timeSecond = b * m + (m - 1);

        if ((timeFirst - timeSecond >= b + 2) || (timeSecond - timeFirst >= a + 2)) {
            System.out.println(-1);
            return;
        }

        if (timeFirst < timeSecond)
            System.out.println(timeFirst + " " + timeSecond);
        else
            System.out.println(timeSecond + " " + timeFirst);
    }
}
