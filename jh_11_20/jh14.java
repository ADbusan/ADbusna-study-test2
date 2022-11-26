package jh_11_20;

import java.util.Scanner;

public class jh14 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("몇시 인지 입력 : ");
        int a = scan .nextInt();
        System.out.println("몇분 인지 입력 : ");
        int b = scan.nextInt();
        System.out.println(a+":"+b);
    }
}
