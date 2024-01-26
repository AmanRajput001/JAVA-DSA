package Notes_4_Functions_or_Methods;

/*
    Scoping: range upto variable if valid. 
    -> function scope: within function only that varibale holds(declared)(valid).
    -> block scope: within block valid, outer method or class variable valid inside block but within block decleared varibales are not valid outside.
    -> class scope: that varibale valid inside a class (in its methods also) only
    -> loop scope: same as block.
    */
public class Scoping {

    public static void function1(){
        int marks = 100; // method scope
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        // System.out.println("Marks: " + marks); //marks is not defined here its scope is in function1() only

        int a = 100;
        { // block
            System.out.println("a: " + a); // a is accesiable inside block
            
            int c = 11; // decleared inside a block
            System.out.println("c: " + c);

            // values declared within block, will remain in block
        }

        // System.out.println("c: " + c); //c is not defined here its scope is in block only
    }
}
