package Notes_15_Pattern_Questions;

/*
14.  *********
      *     *
       *   *
        * *
         *
*/

public class Problem14 {
    public static void main(String[] args) {
        int n = 10;

        for(int i = n; i >= 1; i--){
            for(int m = n - i; m >= 1; m--){
                System.out.print(" ");
            }

            if(i == 1){
                System.out.print("*");
            }else if(i == n){
                for(int j = 1; j <= n; j++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("*");

                for(int k = (i)*2 - 3; k >= 1 ; k--){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}
