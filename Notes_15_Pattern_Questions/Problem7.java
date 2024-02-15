package Notes_15_Pattern_Questions;

/*
7.   *****
      ****
       ***
        **
         *
*/

public class Problem7 {
    public static void main(String[] args) {
        int n = 5;

        for(int m = 0; m < n; m++){
            for(int j = m + 1; j > 1; j--){
                System.out.print(" ");
            }
            for(int i = n - m; i >= 1; i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
