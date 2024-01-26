//DAY-2 Notes 

package Notes_2_Loops_and_Conditionals;

// Print Fabonacci Series (0,1,1,2,3,5,...) upto n terms.

import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = in.nextInt();

        int first = 0;
        int second = 1;
        int next;

        System.out.println("-----Fabonacci Series-----");

        for(int i = 1; i <= n; i++){
            next = first + second;
            System.out.print(first + " ");

            first = second;
            second = next;
        }

//      Print nth term of Fabonacci Series.

        System.out.print("\nEnter n : ");
        n = in.nextInt();

        first = 0;
        second = 1;
        int previous = first;

        for(int i = 1; i <= n; i++){
            previous = first;
            first = second;
            second = previous + second;
        }
        
        System.out.print("Nth term of fabonacci series : " );
        System.out.println(previous);
    }
}
