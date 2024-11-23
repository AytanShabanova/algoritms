package palindromeNumber;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int original=number;
        int remainder=0;
        while(number>0){
            int digit=number%10;
            remainder=remainder*10+digit;
            number=number/10;
        }
        if (remainder==original){
            System.out.println("yes");
        }else {
            System.out.println("no");

        }

    }
}
