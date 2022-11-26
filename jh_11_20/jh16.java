package jh_11_20;

import java.util.Scanner;
//10진수를 8진수로
public class jh16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력 : ");
        int a = scan.nextInt();
        System.out.printf("%o",a);
    }
}
