//DAY-5 Notes

package Notes_5_Array_and_ArrayList;

// get maximum element in 1-d array
public class Maximum {
    public static void main(String[] args) {
        int []arr = {11, 12, 9, 5, 2, 100, 108, 77, 1, 0};

        System.out.println(max(arr)); // 108
    }

    static int max(int []arr){
        int maximum_value = arr[0]; // asssming
        for(int i = 1; i < (arr.length); i++){
            if( maximum_value < arr[i]){
                maximum_value = arr[i];
            }
        }

        return maximum_value;
    }
}
