package Notes_15_Pattern_Questions;

/*
2.  *
    **
    ***
    ****
    *****
*/

public class Problem2 {
    public static void main(String[] args) {
        int n = 5;

        for(int m = 1; m <= n; m++){
            for(int i = 1; i <= m; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
