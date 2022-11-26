package jh_11_20;

import java.util.Scanner;

public class jh20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 3개를 입력 : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int sum = a+b+c;
        float num = sum/3;
        System.out.println(sum);
        System.out.printf("%.1f",num);
    }
}
