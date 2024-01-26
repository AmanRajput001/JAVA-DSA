//DAY-6 Notes

package Notes_6_Linear_searching;

// Find minimum number in an array
public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12, 13, -1, 9, 77, 6, -7, 8, 100, 65};

        System.out.println(min(arr)); // -7
    }

    // assumed arr.length != 0
    static int min(int []arr){
        int minimum = arr[0];

        for(int element : arr){
            if(element < minimum){
                minimum = element;
            }
        }

        return minimum;
    }
}
