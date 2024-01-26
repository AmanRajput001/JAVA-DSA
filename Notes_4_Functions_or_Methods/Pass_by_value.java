package Notes_4_Functions_or_Methods;

/*
   In java, there is no pass by reference.
   Only pass by value.
   Let's say 
    String a = "Course";
    String b = "Course";

    then here both 'a' and 'b' are referencing (pointing) to one object that is 'Course' in memory. 
    
    a --->  'Course' <---- b
 */
public class Pass_by_value {

    //swaps the two numbers

    public static void swap1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Swap numbers
//        int temp = a;
//        a = b;
//        b = temp;

        // will swap1() actually swaps values ??
        swap1(a, b); // No
                     // Reason:- pass by value
        System.out.println(a + " " + b);


    }
}
