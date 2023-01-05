package com.bridgelabz;
public class Thirdpattern {
    public static void main(String[] args) {
        int rows1 = 3, rows2 = 4;
        int i;
        for (i = 0; i < rows1; i++) {
            for (int j = rows1 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (i = 1; i <= rows2; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows2; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
