package Notes_8_Binary_search_Questions;

/*
  Problem 7:
  What are mounted array ?
    arr = [1, 2, 3, 5, 7, 6, 3, 2] => bitonic array
    find peak ? => maximum number

                    7
                5       6
            3               3
        2                       2
    1


*/

/*
    Problem:
    An array arr is a mountain if the following properties hold:

    arr.length >= 3
    There exists some i with 0 < i < arr.length - 1 such that:
    arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
    arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
    Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

    You must solve it in O(log(arr.length)) time complexity.

    Example 1:
    Input: arr = [0,1,0]
    Output: 1

    Example 2:
    Input: arr = [0,2,1,0]
    Output: 1

    Example 3:
    Input: arr = [0,10,5,2]
    Output: 1
*/

public class Problem7_MountedArray {
    public static void main(String[] args) {
        
        int []arr = {0,3,5,12,2};

        Problem7_MountedArray obj = new Problem7_MountedArray();
        System.out.println(obj.findPeak(arr));
    }

    public int findPeak(int nums[]){
        int start = 0;
        int end = nums.length;

        while(start <= end){
            int mid = (start + (end - start)/2);
            
            if((mid+1  != nums.length) && nums[mid] < nums[mid+1]){
                start = mid + 1;
            }else if((mid - 1 != -1) && nums[mid] < nums[mid-1]){
                end = mid - 1;
            }            
            // in the end, start == end and pointing to the largest number because of the start and end are always trying to fin max element in the above 2 checks 
            // hence, when they are pointing just one element, that is the max one beacuse that is what the checks say.
            // more eloboration: at every point of time for start and end , they have the best possible answer till that time and if we are saying that only one item remaining, because of above line. 
            else{
                return nums[mid];
            }
        }

        return 0;
    }

}
