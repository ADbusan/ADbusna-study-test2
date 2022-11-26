package jh_31_40;

import java.util.Scanner;

public class jh32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("영어를 하나 입력 하시오 :");
        String a = scan.nextLine();
        switch (a){
            case"D":
                System.out.println("slowly");
                break;
            case"C":
                System.out.println("run!");
                break;
            case"B":
                System.out.println("good!!");
                break;
            case"A":
                System.out.println("best!!");
                break;
                default:
                    System.out.println("what?");
        }

    }
}
