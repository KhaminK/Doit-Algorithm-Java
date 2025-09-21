package basicAlgorithm;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a: ");
        int a = stdIn.nextInt();
        int b = (findNumBiggerThanA(a, stdIn));

        System.out.println("b - a = " + (b-a));
    }

    static int findNumBiggerThanA(int a, Scanner stdIn){
        int b;
        do{
            System.out.print("b: ");
            b = stdIn.nextInt();
            if (a > b){
                System.out.println("b must be bigger than A");
            }
        }while (a > b);

        return b;
    }
}
