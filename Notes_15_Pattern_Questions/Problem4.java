package Notes_15_Pattern_Questions;

/*
4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/

public class Problem4 {
    public static void main(String[] args) {
        int n = 5;

        for(int m = 1; m <= n; m++){
            for(int i = 1; i <= m; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
