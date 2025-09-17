package basicAlgorithm;

import java.util.Scanner;

//input 3 integers and find the max
public class FindingMinMaxIntegers {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Enter 4 integers");
        System.out.print(("a : "));
        int a = stdIn.nextInt();
        System.out.print(("b : "));
        int b = stdIn.nextInt();
        System.out.print(("c : "));
        int c = stdIn.nextInt();
        System.out.print(("d : "));
        int d = stdIn.nextInt();

        System.out.println("Max is " + max4(a, b, c, d));
        System.out.println("Min is " + min4(a, b, c, d));
    }

    static int max4(int a, int b, int c, int d){
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    static int min4(int a, int b, int c, int d){
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }
}
