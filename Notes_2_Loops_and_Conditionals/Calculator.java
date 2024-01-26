package Notes_2_Loops_and_Conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char val = '\0';

        //Take input from user till user press X or x
        while(true){
            if(val =='X' || val =='x'){
                break;
            }else{
                System.out.println("Enter Operator: ");
                char op = in.next().trim().charAt(0);

                if(op == '+' || op == '/' || op == '*' ||op == '%' || op == '-'){

                    //input two numbers
                    System.out.println("Enter Numbers:");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();

                    if(op == '+'){
                        System.out.println("Result : " + (num1 + num2));
                    }else if(op == '*'){
                        System.out.println("Result : " + (num1 * num2));
                    }else if(op == '/'){
                        if(num2 == 0){
                            System.out.println("Result : " + "undefined");
                        }
                        else{
                            System.out.println("Result : " + (num1 / num2));
                        }
                    }else if(op == '-'){
                        System.out.println("Result : " + (num1 - num2));
                    }else if(op == '%'){
                        System.out.println("Result : " + (num1 % num2));
                    }
                }
                else{
                    System.out.println("Invalid Operation.");
                }

                System.out.println("Wants to exit press(X) or Continue press(C): ");
                val = in.next().trim().charAt(0);
            }
        }
    }
}
