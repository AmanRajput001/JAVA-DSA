package Notes_4_Functions_or_Methods;

import java.util.Scanner;

// Takes user name (lets say 'Aman') and print ("Hello Aman.")

public class GreetingsToUser {

    public static void greetings(String name){
        System.out.println("Hello " + name + ".");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = in.nextLine();

        greetings(name);
    }

    /*
        ----------Output--------
            Enter the name: 
            Kunal Verma
            Hello Kunal Verma.
     */
}
