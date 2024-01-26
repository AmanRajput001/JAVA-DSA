package Notes_2_Loops_and_Conditionals;

/*
    Syntax of if statemnet:-
        if(boolean expression T or F){
            // body
        }else{
            // do this
        }
 */
public class Conditional_if_else {
    public static void main(String[] args) {
        int salary = 254000;
//        if(salary > 1000){
//            salary += 2000;
//        }else{
//            salary +=1000;
//        }
//        System.out.println("New Salary : " + salary); // Output -> New Salary : 256000
          
          // multiple if...else
          salary = 4000;
          if(salary > 20000){
            salary += 2000;
          }else if(salary > 10000){
            salary += 1000;
          }else{ //if none of above condition is true 
            salary += 100;
          }
          System.out.println("New Salary : " + salary); // Output -> New Salary : 4100
    }
}
