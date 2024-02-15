package Notes_15_Pattern_Questions;

/*
3.  *****
    ****
    ***
    **
    *
*/

public class Problem3 {
    public static void main(String[] args) {
        int n = 5;

        for(int m = 1; m <= n; m++){
            for(int i = n - m; i >= 0; i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
