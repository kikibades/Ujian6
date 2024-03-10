package com.juaracoding;

public class Soal3 {
    public static void main(String[] args) {
        String[] T1 = {":T1:202112SOAL3",":T1:202111SOAL3",":T1:202110SOAL3"};
        String[] T2 = {"SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT"
                ,"SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT"
                ,"SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT"};

        processAndPrint(T1[0], T2[0]);
        processAndPrint(T1[1], T2[1]);
        processAndPrint(T1[2], T2[2]);
    }

    public static void processAndPrint(String T1, String T2) {
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
