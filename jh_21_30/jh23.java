package jh_21_30;

import java.util.Scanner;

public class jh23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("두 정수를 입력 : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a==b){
            System.out.println("1");
        }else if (a != b){
            System.out.println("0");
        }
    }
}
