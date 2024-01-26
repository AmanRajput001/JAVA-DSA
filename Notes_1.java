//---For compiling any java program we need to do:- javac program_name.java  (converts to byte code)
//--to run ay java program byte code we need to do:- java program_name  (run byte code where main method present)

/*
    public class Notes_1{
        public static void main(String [] args){
            System.out.println("Hello Java.");
        }
    }

    //*********************OUTPUT**********************
    // PS D:\Aman Rajput MCA\JAVA> javac Notes_1.java
    // PS D:\Aman Rajput MCA\JAVA> java Notes_1      
    // Hello Java.
    //*************************************************

*/

/*
 * public :- this class can be accessed from anaywhere.
 * class :- group of methods and data memebers (instance variable).
 * Notes_1 :- name of class (public class same as name of file).
 * public :- this methods is accessed from anywhere.
 * static :- refers the class not particular object.
 * void :- return nothing. 
 * main :- entry of program ('main is keyword')
 * (String [] args) :- these are command line arguments
 */

/*
 * System :- is a in built class ( final class)
 * out :- variable in System class (like a reference variable for print stream), Standard output stream
 * println() :- method which helps in printing , take string as parameter, and add new line.
 */

// COMMENTS:- these are lines used to describe part of code, they are simply ignore by compiler during compilation.

// Literals:- These are the syntatical representation of data types.
// Example :- int a = 10; //here 'a' is reference varaible called identifier
// Java works on Unicode values.

/*
    public class Notes_1{
        public static void main(String [] args){
            //Printing two hundered and thirty four million
            int a = 234_000_000; //234,000,000
            System.out.println("Integer a: " + a);
        }
    }
*/

/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Command line arguments~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
/*
    public class Notes_1{
        public static void main(String [] args){
            System.out.println("argument given :- " + args[0] + args[1] + args[3]);
            System.out.println("no. of arguments given :- " + args.length); //length in-built attribute for arrays to get length of array.
        }
    }


    //*********************OUTPUT**********************
    //  PS D:\Aman Rajput MCA\JAVA> javac Notes_1.java
    //  PS D:\Aman Rajput MCA\JAVA> java Notes_1 Sun is in Solar System.
    //  argument given :- SunisSolar
    //  no. of arguments given :- 5
    //*************************************************
*/

/* 
1. if you want .class file (byte code in some specific folder) give path while compilation
    //****************************Example***************************
    // PS D:\Aman Rajput MCA\JAVA> javac -d byte_codes Notes_1.java

2. What is 'javac' ?
         -> it is executable file located in you computer.
         -> The javac compiler takes these source code files as input and 
            produces bytecode files with a .class extension.
        -> to check version of javac :- javac -version
*/

/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Packages in java~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
/*
    package Notes_Java;

    public class Notes_1{
        public static void main(String [] args){
            System.out.println("Hello Java.");
        }
    }

//Above code specifies that this particular file (code) is under Notes_java Pacakage

// What is Package ?
// --> it is kind of directory only , 
// --> help in managing classes/interfaces in organize and structure format.
// --> help in access control mechanisim, access modifier Package-private (default).

*/


/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Data Types~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
//A Data Type is a classification that specifies which type of value a variable can hold, 
//what operations can be performed on that value, and how the value is stored in memory.
//Data Types are of two type Primitive and Non-Primitive.
//Primitive Data types:- that cannot be break further in more data types. Example:- int, char, double, float, long, boolean.

/*
    public class Notes_1{
        public static void main(String [] args){
            //Primitive data types
            int integer = 64; // 4-bytes
            char letter = 'A'; // 2-bytes 
            float decimal = 98.78f; // 4-bytes
            // All decimal values by default are in double to store in float we need to add 'f' at last
            double largedecimalnumbers = 23456876.12890; // 8-bytes
            // All integer values by default are in int to store in long we need to add 'L' at last
            long largeintegernumbers = 3456721891672554L; // 8-bytes
            boolean check = false;

            //We also have class for them 'Wrapper classes' like:-
            Integer rno = 64;
        }
    }
*/

//Non-Primitive:- that can be break down into further more data types. Example :- String
/*
    public class Notes_1{
        public static void main(String [] args){
            //Non-Primitive data types
            String senetence = "Sun is part of solar system.";
            // we can break down it two characters further
        }
    }
*/


/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~How to take input~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
/*
// Input in java we use Scanner 'import java.util.Scanner;'

    import java.util.Scanner;

    public class Notes_1{
        public static void main(String [] args){

            System.out.println("Enter :- ");

            Scanner input = new Scanner(System.in); // creating object of scanner class
            System.out.println(input.nextInt()); // taking input of integer
        }
    }

            //**************************OUTPUT***************************
            //  PS D:\Aman Rajput MCA\JAVA\Notes_Java> java Notes_1.java
            //  Enter :- 
            //  11
            //  11
            //***********************************************************
*/

/*
    // Takes Input of various data types 
    import java.util.Scanner;
    
    public class Notes_1{
        public static void main(String [] args){
            Scanner input = new Scanner(System.in); // creating object of scanner class
        
            System.out.println("Enter Integer:- ");
            System.out.println(input.nextInt()); // taking input of integer
        
            System.out.println("Enter String:- ");
            //for enter string first clean buffer use scannerObject.nextLine();
            input.nextLine();
            System.out.println(input.nextLine());
        
            System.out.println("Enter Character:- ");
            System.out.println(input.next().charAt(0));
        
            System.out.println("Enter decimal:- ");
            System.out.println(input.nextFloat());
        
            System.out.println("Enter Boolean:- ");
            System.out.println(input.nextBoolean());
        }
    }
*/

/*
    // WAP in java to take input of two integer and print sum.
    import java.util.Scanner;

    public class Notes_1{
        public static void main(String [] args){
            Scanner input = new Scanner(System.in); // creating object of scanner class
        
            System.out.println("Enter Two Integer:- ");
            int a = input.nextInt(); // taking input of integer        
            int b = input.nextInt(); // taking input of integer

            int sum = a + b;

            System.out.println("Sum is : " + sum);      
        }
    }


    //**************************OUTPUT***************************
    // PS D:\Aman Rajput MCA\JAVA\Notes_Java> javac Notes_1.java  
    // PS D:\Aman Rajput MCA\JAVA\Notes_Java> java Notes_1
    // Enter Two Integer:- 
    // 12 13
    // Sum is : 25
    //***********************************************************
    // PS D:\Aman Rajput MCA\JAVA\Notes_Java> java Notes_1
    // Enter Two Integer:-
    // 12 ABC
    // Exception in thread "main" java.util.InputMismatchException
    //         at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    //         at java.base/java.util.Scanner.next(Scanner.java:1594)
    //         at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    //         at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    //         at Notes_1.main(Notes_1.java:192)
    //***********************************************************
    // PS D:\Aman Rajput MCA\JAVA\Notes_Java> java Notes_1
    // Enter Two Integer:- 
    // 12 13.22
    // Exception in thread "main" java.util.InputMismatchException
    //         at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    //         at java.base/java.util.Scanner.next(Scanner.java:1594)
    //         at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    //         at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    //         at Notes_1.main(Notes_1.java:192) 
    //***********************************************************  
*/

/*
    // WAP in java to take input of two double decimal value and print sum.
    import java.util.Scanner;

    public class Notes_1{
        public static void main(String [] args){
            Scanner input = new Scanner(System.in); // creating object of scanner class
        
            System.out.println("Enter Two double decimal values:- ");
            double a = input.nextDouble(); // taking input of double decimal value        
            double b = input.nextDouble(); // taking input of double decimal value

            double sum = a + b;

            System.out.println("Sum is : " + sum);      
        }
    }

    //**************************OUTPUT***************************
    // PS D:\Aman Rajput MCA\JAVA\Notes_Java> javac Notes_1.java
    // PS D:\Aman Rajput MCA\JAVA\Notes_Java> java Notes_1
    // Enter Two double decimal values:- 
    // 122.345 221.223
    // Sum is : 343.568
    //***********************************************************
    // PS D:\Aman Rajput MCA\JAVA\Notes_Java> java Notes_1
    // Enter Two double decimal values:- 
    // 34.23   
    // 56
    // Sum is : 90.22999999999999
    //***********************************************************
    // PS D:\Aman Rajput MCA\JAVA\Notes_Java> java Notes_1
    // Enter Two double decimal values:- 
    // 11.90 
    // Abc
    // Exception in thread "main" java.util.InputMismatchException
    //         at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    //         at java.base/java.util.Scanner.next(Scanner.java:1594)
    //         at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
    //         at Notes_1.main(Notes_1.java:240)
    //***********************************************************  
*/

/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Typecasting~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
// Typecasting:- also known as type conversion, is the process of converting a variable from one data type to another.

// Implicit Typecasting (automatic) (widening):- Implicit typecasting, also known as widening or automatic type conversion, 
//                                               occurs when the conversion is done by the compiler without the programmer's intervention.
//                                               It happens when you assign a value of a smaller or less precise data type to a variable of a larger or more precise data type.
/*
    public class Notes_1{
        public static void main(String[] args){
            //Implicit typecasting
            float decimal = 132; // (int) -> (float)
            System.out.println(decimal); // output -> 132.0

            double bigdecimal = 1132.234f; // (float) -> (double)
            long integer = 12; // (int) -> (long)

            int ch = 'A'; // (char) -> (int)
            System.out.println(ch);
        }
    }
*/

//Explicit Typecasting  (Narrowing):- Explicit typecasting, also known as narrowing or manual type conversion,
//                                    requires the programmer to explicitly specify the type conversion.
//                                    It is needed when you want to convert a value of a larger or more precise data type to a smaller or less precise data type.
/*
    public class Notes_1{
        public static void main(String[] args){
            //Explicit typecasting
            int num = (int) 132.234; // (int) <- (float)
            System.out.println(num); // output -> 132

            float bigdecimal = (float) 1132.234; // (float) <- (double)
            int integer = (int) 12L; // (int) <- (long)
        }
    }
*/

/*
    public class Notes_1{
        public static void main(String[] args){
            byte val1 = (byte) 255;
            System.out.println(val1); // output ->  -1

            //byte range -128 to 127   (total 256 values)    
            byte val2 = (byte) 257;
            System.out.println(val2); // output ->  1 // as 257 % 256 = 1
        }
    }
*/

/*
    public class Notes_1{
        public static void main(String[] args){
            byte a = 40;
            byte b = 50;
            byte c = 100;
            byte d = (byte) ((a * b) / c); // (a * b) will give int automatically by java

            System.out.println((a*b)); // output -> 2000    
            System.out.println(d); // output -> 20
        }
    }
*/


/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Basic of if...else And While loop~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
/*
    if(<condition>){ // if condition is true 

    }else{

    }

    //Loops:- used to execute some set of statment again and again if conditions holds
    //While Loop
    while(<condition>){ // run till condition is true

    }

    //For Loop
    for(<initialization>; <Condition>; <increment/decrement>){

    }
*/

/*
    public class Notes_1{
        public static void main(String[] args){
             int a = 10;
             
             //if...else
             if(a == 10){
                System.out.print("Condition True");
             }
             else{
                System.out.print("Condition False");
             }

             //For Loop
             for(int i = 0; i < 5; i++){
                System.out.println("*");
             }

             //While Loop
             while (true) { // runs infinitly
                System.out.println("*"); 
             }
        }
    }
*/

