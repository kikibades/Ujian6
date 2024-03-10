package com.juaracoding;

public class Soal2 {

    public static void main(String[] args) {
        int n = 9;
        int m = 5;

        for (int i = 0; i < m; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 1)) {
                    System.out.print(j);
                } else {
                    System.out.print("_");
                }

                if (j < n) {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }

}

