package Notes_8_Binary_search_Questions;
/*
  Problem 6:
  find the index of target element in an infinite array.
  (You cannot use array.length attribute to find length of array.)
*/

public class Problem6 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,176,178,190,200,201};
       System.out.println(arr[binarySearch(arr, 178)]);
    }

    public static int binarySearch(int []arr, int target){
        int val = search(arr, target, 0, 1); // starting with box of size 2 element
        return val;
    }

    public static int search(int []arr, int target, int start, int end){ // increasing the box size each time
        while(start <= end){
            int mid = (start + (end - start)/2);

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else if(target == arr[mid]){
                return mid;
            }
        }

        return search(arr, target, end, (int) Math.pow(2,end)); // increase the end as (pow(2,0), pow(2,2), pow(2,4), pow(2,5) ...) make time complexity also O(log(N))
    }
}

