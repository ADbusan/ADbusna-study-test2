package jh_31_40;

import java.util.Scanner;

public class jh31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력 하시오 :");
        int  a = scan.nextInt();


            if (a>=90){
                System.out.println("A");
            }
            else if (a>=70){
                System.out.println("B");
            }
            else if (a>=40){
                System.out.println("C");
            }
            else if (a>0){
                System.out.println("D");
            }

        }
    }

