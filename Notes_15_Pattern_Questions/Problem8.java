package Notes_15_Pattern_Questions;

/*
8.      *
       ***
      *****
     *******
    *********
*/

public class Problem8 {
    public static void main(String[] args) {
        int n = 5;

        for(int m = 1; m <= n; m++){
            for(int j = n - m; j > 0; j--){
                System.out.print(" ");
            }
            for(int i = 1; i <= m; i++){
                System.out.print("*");
            }
            for(int k = 1; k < m; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
