package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int mulSum = 0;
        for (int i = 0; i <1000; i++) {


            if ((i % 5 == 0) || (i % 3 == 0)) {
                System.out.println(i);
                mulSum = mulSum + i;
            }
        }
        System.out.println(mulSum);
















    }
}
