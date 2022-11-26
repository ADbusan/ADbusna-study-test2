package jh_21_30;

import java.util.Scanner;



public class jh30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("세정수를 입력: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a % 2 == 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
        if (b % 2 == 0) {
            System.out.println("odd");
        }else {
            System.out.println("even");
        }
        if (c % 2 == 0) {
            System.out.println("odd");
        }else {
            System.out.println("even");
        }
    }
}