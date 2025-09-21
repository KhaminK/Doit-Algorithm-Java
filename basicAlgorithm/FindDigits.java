package basicAlgorithm;

import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("num: ");
        int num = stdIn.nextInt();
        int digit = findDigits(num);
        System.out.println("num is " + digit + " digits");
    }

    static int findDigits(int num){
        int digit  = 0;
        while (num > 0){
            num /= 10;
            digit++;
        }
        return digit;
    }
}
