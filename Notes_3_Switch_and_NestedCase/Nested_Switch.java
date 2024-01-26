package Notes_3_Switch_and_NestedCase;

import java.util.Scanner;

// switch inside switch is nested switch

//Example :-
public class Nested_Switch {
    public static void main(String[] args) {
      System.out.println("1. wants to see employee name.");
      System.out.println("2. wants to see various departments.");  
      Scanner in = new Scanner(System.in);
      System.out.println("Enter: ");
      int choice = in.nextInt();

      switch(choice){
        case 1 ->{ 
                System.out.println("Enter the employee id: ");
                int id = in.nextInt();
                switch(id){ // nested switch case
                    case 1 -> System.out.println("Kunal sharma.");
                    case 2 -> System.out.println("Aman Rajput");
                    default -> System.out.println("Invalid Id.");
                }
        }

        case 2 -> {
            System.out.println("Enter the department id: ");
            int id = in.nextInt();
            switch(id){ // nested switch case
                case 1 -> System.out.println("Cyber Security.");
                case 2 -> System.out.println("Website Development");
                default -> System.out.println("Invalid Id.");
            }
        }

        default -> System.out.println("Inavlid choice");
      }
    }
}
