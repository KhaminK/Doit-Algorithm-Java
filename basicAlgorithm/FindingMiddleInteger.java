package basicAlgorithm;

import java.util.Scanner;

//input 3 integers and print the middle value
public class FindingMiddleInteger {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("It finds middle value of three integers");
        System.out.print("a: ");
        int a = stdIn.nextInt();
        System.out.print("b: ");
        int b = stdIn.nextInt();
        System.out.print("c: ");
        int c = stdIn.nextInt();

        int result = med3(a, b, c);

        System.out.println("Middle value is " + result);
    }

    static int med3(int a, int b, int c){
        if (a >= b){
            if (b >= c){
                return b;
            } else if (a <= c){
                return a;
            } else{
                return c;
            }
        } else if (a > c){
            return a;
        } else if (b > c){
            return c;
        } else{
            return b;
        }
    }
}
