package Notes_16_Recursion;

public class Recursion {
    public static void main(String[] args) {
        // write a function that print hello wold
        message();
    }

    static void message(){
        System.out.println("Hello World");
        message1();
    }

    
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    
    static void message3(){
        System.out.println("Hello World");
    }

    /*
     all these functions have one thing in common that is body 
     
     after message4() finish execution it go back message3() from where it is called
     after message3() finish execution it go back message2() from where it is called
     after message2() finish execution it go back message1() from where it is called
     likewise... 
     
    */
}
