package Notes_15_Pattern_Questions;

/*
5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
*/

public class Problem5 {
    public static void main(String[] args) {
        int n = 5;

        for(int m = 1; m <= n; m++){
            for(int i = 1; i <= m; i++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int m = 1; m < n; m++){
            
            for(int i = n - m - 1; i >= 0; i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
