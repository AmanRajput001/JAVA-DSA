//DAY-3 Notes 

package Notes_3_Switch_and_NestedCase;

import java.util.Scanner;

/**
    1 - Monday
    2 - Tuesday
    3 - Wednesday
    4 - Thursday
    5 - Friday
    6 - Saturday
    7 - Sunday

 * Lets say if user enters day number to be 3
 * => this means its wednesday => its weekday
 */

public class Weekand_Or_Weekday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number: ");
        int day = in.nextInt();

        // normal switch case
        switch(day){
            case 1: //Monday
            case 2: //Tuesday
            case 3:
            case 4:
            case 5: //Friday
                System.out.println("It's a WeekDay.");
                break;
            case 6: //Saturday
            case 7: //Sunday
                System.out.println("It's a WeekEnd.");
                break;
        }

        //enhanced switch case
        switch(day){
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }
    }
}
