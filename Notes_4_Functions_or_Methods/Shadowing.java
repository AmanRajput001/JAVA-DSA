//DAY-4 Notes 

package Notes_4_Functions_or_Methods;

// In java, Shadowing means is a practice two variable with same name within the scops that over laps. 

//Example:-
public class Shadowing {
    static int x = 90; // it will be shadowed at line 12
    public static void main(String[] args) {
        System.out.println(x); // 90

        int x = 40;
        System.out.println(x); // 40

        fun();
    } 

    static void fun(){
        System.out.println(x); // 90
    }
}
