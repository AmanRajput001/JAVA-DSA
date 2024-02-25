package Notes_16_Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = -2;

        System.out.println(binarySearch(0, arr.length, target, arr));

    }

    static int binarySearch(int start, int end, int target, int []arr){

        int mid = (start + (end - start)/2);

        if(start <= end){
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            return binarySearch(start, end, target, arr);
        }else{
            return -1;
        }
    }
}
