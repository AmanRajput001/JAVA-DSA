package Notes_15_Pattern_Questions;

/*
6.       *
        **
       ***
      ****
     *****
*/

public class Problem6 {
    public static void main(String[] args) {
        int n = 5;

        for(int m = 1; m <= n; m++){
            for(int j = 0; j < n - m; j++){
                System.out.print(" ");
            }
            for(int i = 1; i <= m; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
