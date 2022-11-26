package jh_21_30;

import java.util.Scanner;

public class jh29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 하나를 입력 : ");
        int a = scan.nextInt();

        if (a<0){
            System.out.println("minus");
        }else if (a>=0){
            System.out.println("plus");
        }
        if (a%2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
