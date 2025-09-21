package basicAlgorithm;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Finds the sum of numbers from 1 to n");
        System.out.print("n: ");
        int n = stdIn.nextInt();

        int i = 1;

        int sum = sumOfNumbersTilN(i, n);
        System.out.println("Result: " + sum);
    }

    static int sumOfNumbersTilN(int i, int n){
        int sum = 0;
        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println("i: "+i);
        return sum;
    }
}
