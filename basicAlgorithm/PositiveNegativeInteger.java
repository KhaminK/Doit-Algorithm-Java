package basicAlgorithm;

import java.util.Scanner;

public class PositiveNegativeInteger {
    public static void main(String[] args){
        System.out.println("It defines if an integer is positive, zero, or negative");
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a: ");
        int a = stdIn.nextInt();
        PositiveNegativeIntegerDefiner(a);
    }

    static void PositiveNegativeIntegerDefiner(int a){
        if (a > 0) {
            System.out.println("The value is positive");
        } else if (a == 0){
            System.out.println("The value is zero");
        } else{
            System.out.println("The value is negative");
        }
    }
}
