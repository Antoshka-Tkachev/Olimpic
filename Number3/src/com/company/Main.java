package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        int min;
        int indexMin = 0;
        int itogMin = 0;
        int itogN = 0;
        ArrayList<Integer> array = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
            array.add(in.nextInt());

        while (n != 0) {
            min = 100000;
            for (int i = 0; i < n; i++) {
                if (array.get(i) < min) {
                    min = array.get(i);
                    indexMin = i;
                }
            }
            if (sum < n * min) {
                sum = n * min;
                itogN = n;
                itogMin = min;
            }
            array.remove(indexMin);
            n--;
        }

        System.out.println(itogN);
        System.out.println(itogMin);
    }
}
