package basicAlgorithm;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Finds the sum of numbers from 1 to n");
        System.out.print("n: ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        sum = sumOfNumbersTilN(i, n, sum);
        System.out.println("Result: " + sum);
    }

    static int sumOfNumbersTilN(int i, int n, int sum){
        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println("i: "+i);
        return sum;
    }
}
