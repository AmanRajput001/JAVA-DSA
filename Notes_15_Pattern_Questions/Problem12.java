package Notes_15_Pattern_Questions;

/*
12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
*/

public class Problem12 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }

            for(int m = n+1 - i; m >= 1; m--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= 5; i++){
            for(int m = n - i; m >= 1; m--){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();;
        }
        
    }
}
