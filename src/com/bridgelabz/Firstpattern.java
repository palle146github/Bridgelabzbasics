package com.bridgelabz;
public class Firstpattern {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 10; i++) {
            if (i <= 5) {
                int j;
                for (j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            } else {
                int k;
                for (k = 1; k < 10 - i + 1; k++) {
                    System.out.print(k);
                }
            }
            System.out.println("");
        }

    }
}
