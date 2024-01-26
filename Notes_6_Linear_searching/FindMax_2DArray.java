package Notes_6_Linear_searching;

public class FindMax_2DArray {
    public static void main(String[] args) {
        int [][]arr = {
            {1, -2, 3},
            {11, 120, 400, -900},
            {-200, 300, -13, 14, 15}
        };

        System.out.println(max(arr)); // 400
    }

    // assumed arr.length != 0
    static int max(int [][]arr){
        int maximum = Integer.MIN_VALUE; 
        System.out.println(Integer.MIN_VALUE); // -2147483648

        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                if(maximum < arr[r][c]){
                    maximum = arr[r][c];
                }
            }
        }
        return maximum;
    }
}
