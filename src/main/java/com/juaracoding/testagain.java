package com.juaracoding;

public class testagain {

    public static void main(String[] args) {
        int n = 9;
        int m = 5;

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j <= n - i; j++) {
                // ganti angka genap menjadi "_"
                if (j % 2 == 0) {
                    System.out.print("_");
                } else {
                    System.out.print(j);
                }
            }

            System.out.println();
        }
    }
}
