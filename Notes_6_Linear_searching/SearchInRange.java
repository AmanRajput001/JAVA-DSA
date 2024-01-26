//DAY-6 Notes

package Notes_6_Linear_searching;

public class SearchInRange {
    public static void main(String[] args) {
        int []arr = {18, 12, 9, 14, 77, 50, 66, 3, 22};
        int element = 77;
        
        int start1 = 2;
        int end1 =  5;

        int start2 = 5;
        int end2 =  7;

        int index = linearSearch(arr, element, start1, end1); //  4
        display(element, index);

        index = linearSearch(arr, element, start2, end2); //  -1
        display(element, index);
    }

    // search in the array: return the index if item found
    // Otherwise if item is not found return -1
    static int linearSearch(int[] arr, int element, int start, int end){
        for(int i = start; i <= end; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    static void display(int element, int index){
        if(index != -1){
            System.out.println("Index of element " + element + " is: " + index);
        }
        else{
            System.out.println("Element " + element + " not found");
        }
    }
}

