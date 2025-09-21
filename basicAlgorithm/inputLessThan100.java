package basicAlgorithm;

import java.util.Scanner;

public class inputLessThan100 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int num;
        do{
            System.out.print("num: ");
            num = stdIn.nextInt();
        }while (num > 99|| num < 10);

        System.out.println("Num is " + num + ", which is two digit number");
    }
}
