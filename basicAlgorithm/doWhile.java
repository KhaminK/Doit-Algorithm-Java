package basicAlgorithm;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args){
        int n = inputUntilNotNegative();
        int sum = SumWhile.sumOfNumbersTilN(1, n);
        System.out.println("Sum of all numbers from 1 to " + n + " is " + sum);
    }

    static int inputUntilNotNegative(){
        Scanner stdIn = new Scanner(System.in);
        int n;
        do{
            System.out.print("n: ");
            n = stdIn.nextInt();
        }while(n < 0);

        return n;
    }

}
