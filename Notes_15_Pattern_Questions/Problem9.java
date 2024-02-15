package Notes_15_Pattern_Questions;

/*
9.  *********
     *******
      *****
       ***
        *
*/

public class Problem9 {
    public static void main(String[] args) {
        int n = 5;

        for(int m = n; m >= 1; m--){
            
            for(int j = n - m; j >= 1; j--){
                System.out.print(" ");
            }
            for(int i = m; i >= 1; i--){
                System.out.print("*");
            }
            for(int k = m - 1; k >= 1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
