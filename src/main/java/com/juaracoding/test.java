package com.juaracoding;

public class test {
    public static void main(String[] args) {

//        String T1 = "202112SOAL3";

//        String[] T2 = {"SOAL3/2112/AB00000" , "0011 OD:0001234500" , "CDE5432100 SOAL003" , " ABCDE12345 XAS SK" , "ILL TEST ESSAY .DT"};


            String T2 = "SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT";

            int totalLength = T2.length();

            if (totalLength % 5 == 0) {
                int partLength = totalLength / 5;

                String trailer1 = T2.substring(0, partLength);
                String trailer2 = T2.substring(partLength, 2 * partLength);
                String trailer3 = T2.substring(2 * partLength, 3 * partLength);
                String trailer4 = T2.substring(3 * partLength, 4 * partLength);
                String trailer5 = T2.substring(4 * partLength);

                System.out.println(":T2:" + trailer3 + trailer4 + trailer5 + trailer1 + trailer2);
            } else {
                System.out.println("Panjang total string tidak dapat dibagi rata menjadi 5 bagian.");
            }

        }
    }

