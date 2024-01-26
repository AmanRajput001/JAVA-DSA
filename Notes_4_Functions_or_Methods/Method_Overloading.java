//DAY-4 Notes 

package Notes_4_Functions_or_Methods;

// Function Overloading / Method Overloading
// methods with same name but different parameters

//Which method to be called determined at compiled time => Method Overloading also knows compile time polyporphism.

public class Method_Overloading {
    public static void function(int a){
        System.out.println("Function 1");
    }

    public static void function(int a, int b){
        System.out.println("Function 2");
    }

    public static void function(String a){
        System.out.println("Function 3");
    }
    
    public static void demo(String ...v) {
        System.out.println("String Demo");
    }

    public static void demo(int ...v) {
        System.out.println("Int Demo");
    }

    public static void main(String[] args) {
        function("Ram"); // Function 2
        function(10, 100); // Function 3
        function(10); // Function 1

        demo(1, 2, 3, 4); // Int Demo
        demo("Aman", "Kunal", "Vishal"); // String Demo
        // demo(); // Error -> no method without parameter of named demo 

    }
}
