package com.juaracoding;

public class Soal3ke2 {
    public static void main(String[] args) {

        String T1 = ":T1:202111SOAL3";
        String T2 = "SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT";

        int totalLength = T2.length();

        if (totalLength % 5 == 0) {
            int partLength = totalLength / 5;

            String trailer1 = T2.substring(0, partLength);
            String trailer2 = T2.substring(partLength, 2 * partLength);
            String trailer3 = T2.substring(2 * partLength, 3 * partLength);
            String trailer4 = T2.substring(3 * partLength, 4 * partLength);
            String trailer5 = T2.substring(4 * partLength);

            System.out.println(T1);
            System.out.println(":T2:" + trailer3 + trailer4 + trailer5 + trailer1 + trailer2);
        } else {
            System.out.println("Panjang total string tidak dapat dibagi rata menjadi 5 bagian.");
        }

    }
}



