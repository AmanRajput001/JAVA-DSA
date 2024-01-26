package Notes_3_Switch_and_NestedCase;

import java.util.Scanner;

/*
  Switch-case: In switch case you can jump to various cases based on on your expression.

  Syntax:
    switch(expression){
        // case
        case one:
            // do something
            break;
        case two:
            // do something
            break;
        case three:
            // do something
            break;
        default: // no case matches
            // do something
    }

    Note:- 
        - cases must be same type as of your expressions, must be a constant or literal.
        - duplicate cases are not allowed.
        - break is use to terminate the sequenece.
        - if break is not used, it will continue to next case.
        - default  is execute when none of above case matches
        - if default is not at end , put break after it

 */

// Takes input of fruits and if fruit matches then display a message. 
public class Switch {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the fruit name: ");
      String fruit = in.nextLine();
      
      switch(fruit){
        case "Mango": 
            System.out.println("Mango is King of fruits.");
            break;
        case "Apple":
            System.out.println("An Apple a day keeps doctor a way.");
            break;
        default:
            System.out.println("It's a fruit.");

      }

      /*
        -------------Output------------
            Enter the fruit name: 
            Apple
            An Apple a day keeps doctor a way.
       */

       //What if we not put break ?
       System.out.println("Enter the fruit name: ");
       fruit = in.nextLine();
       
       switch(fruit){
         case "Mango": 
             System.out.println("Mango is King of fruits.");
             
         case "Apple":
             System.out.println("An Apple a day keeps doctor a way.");
             
         default:
             System.out.println("It's a fruit.");
 
       } // all statements after matched case execute if no break

      /*
        -------------Output------------
            Enter the fruit name: 
            Apple
            An Apple a day keeps doctor a way.
            It's a fruit.
       */

       //We can also use enhanced switch for much neater way and no need to use break after each case (its automatically assumed).
       System.out.println("Enter the fruit name: ");
       fruit = in.nextLine();
       
       switch(fruit){
         case "Mango" -> System.out.println("Mango is King of fruits.");
             
         case "Apple" -> System.out.println("An Apple a day keeps doctor a way.");
             
         default -> System.out.println("It's a fruit.");
       }
       /*
        -------------Output------------
            Enter the fruit name: 
            Apple
            An Apple a day keeps doctor a way.
       */
    }
}
