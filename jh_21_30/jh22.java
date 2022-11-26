package jh_21_30;

import java.util.Scanner;

public class jh22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a>b){
            System.out.println("1");
        }else if (b>=a){
            System.out.println("0");
        }
    }
}
