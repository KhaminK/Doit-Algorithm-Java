package basicAlgorithm;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Sum of all numbers between a and b (included)");
        System.out.print("a: ");
        int a = stdIn.nextInt();
        System.out.print("b: ");
        int b = stdIn.nextInt();

        int sum = sumof(a, b);
        printAtoB(a, b, sum);
    }

    static int sumof(int a, int b){
        int result = (b-a+1)*(a+b)/2;
        return result;
    }

    static void printAtoB(int a, int b, int sum){
        while (a <= b){
            System.out.print(a);
            if (a != b){
                System.out.print(" + ");
            }
            a++;
        }
        System.out.print("= " + sum);
    }


}
