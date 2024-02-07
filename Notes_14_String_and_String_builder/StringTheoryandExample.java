package Notes_14_String_and_String_builder;

/*
    Most commonly used class in java is String.
    Every string that you create is an object of type String.

    String a = "Aman"
    String b = "Aman"

    is a, b creating different objects or pointing to same ?
    => 
        a --> "Aman" <-- b ?? (true or flase)   ::- true
    ---------------------------------------------------------------     
        a --> "Aman" 
        b --> "Aman" ?? (true or flase)   ::- false

    Concepts:-

    1. String pool = separate memory structure in heap for String, use all similar values of string is not created again which already exists in pool.
                     make are program more optimise.
    
    2. Immutability = string cannot be changed/modified => for security reasons.
                      if wants to modify the string after delaration create new object.
    You can do this like:-
    String a = "Aman"; // (String object created) this reference variable is of type of String
    a = "Rajput"; // (new string object created)

    At first,              
                    a --> |"Aman"|
    After new initalisation,
                              |"Aman"  |
                        a --> |"Rajput"|
    
    At first a is point "Aman", After a is pointing "Rajput" we can see string object "Aman" is not modified.
    this "Aman" object go for garbage collection.

*/

public class StringTheoryandExample {
    public static void main(String[] args) {
        int a = 10; // this reference variable is of type of int
        String name = "Aman Rajput"; // this reference variable is of type of String
        System.out.println(name); // to print string
    }
}
