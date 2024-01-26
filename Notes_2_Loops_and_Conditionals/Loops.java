//DAY-2 Notes 

package Notes_2_Loops_and_Conditionals;

import java.util.Scanner;

/*
 Loops :- These are the statements we as programmer wants to execute again and again, based on certain condition
 
 Syantax of for loop:
        for(initilisation; condition; increment/decrement){
            // body
        }

  Syantax of while loop:
        while(condition){
            //body
        }

  Syantax of do...while loop:
        // In do while loop, loop willl run atleast once.
        do{
            //body
        }
        while(condition);

 */

public class Loops {
    public static void main(String[] args) {
        //------------------for loop------------------
        
        // print numbers from 1 to 5
        for (int  num = 1; num <= 5; num += 1){
            System.out.println(num);
        }
        /*
         * A starting num is initialised to 1
         * then it will check condition whether num <= 5 if yes 
         * execute the print statement
         * then it will icremnet num by 1
         * repeat processs till num <= 5 become false means num become greater than five.
         */

        // Print numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: "); 
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i); 
            // output -> Enter n: 3
            //           123
        }

        //------------------while loop------------------
        // print numbers from 1 to 5

        int num = 1; 

        while(num <= 5){ // condition
            System.out.println(num);
            num += 1;
        }

        /*
         * we gernally use for loop when we know how many time loop is gona run.
         * we gernally use while loop we do not know how many time loop is gona run.
         * 
         * example :- run loop to print 1 to 100 numbers => we use for loop
         *            run loop till user press 'X' => use while loop. gernally 
         */

        //------------------do while loop------------------
        n = 1;
        do{
            System.out.println(n);
            n++;
        }while(n <= 5);

        //do...while loop will run atleast once
        n = 1;
        do{
            System.out.println("Hello World");
        }while(n != 1);
        //Output -> Hello World
    }
}
