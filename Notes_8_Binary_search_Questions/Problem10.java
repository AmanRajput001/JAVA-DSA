package Notes_8_Binary_search_Questions;

/*
    Problem 10:
    There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

    Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

    Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

    You must decrease the overall operation steps as much as possible.

    

    Example 1:

    Input: nums = [2,5,6,0,0,1,2], target = 0
    Output: true
    Example 2:

    Input: nums = [2,5,6,0,0,1,2], target = 3
    Output: false
 */


public class Problem10 {
    /*
     * public boolean search(int[] nums, int target) {
     * Arrays.sort(nums);
     * 
     * int start = 0;
     * int end = nums.length - 1;
     * while (start <= end) {
     * int mid = (start + (end - start) / 2);
     * 
     * if (target < nums[mid]) {
     * end = mid - 1;
     * } else if (target > nums[mid]) {
     * start = mid + 1;
     * } else {
     * return true;
     * }
     * }
     * 
     * return false;
     * }
     */

     public boolean search(int[] nums, int target) {
        int index_pivot = -1;
        if (nums.length == 1) {
            index_pivot = 0;
        }else if(nums.length == 2){
            if(nums[1] > nums[0]){
                index_pivot = 1;
            }else{
                index_pivot = 0;
            }
        }
        else{
            index_pivot = getPivot(nums);
        }

        if (index_pivot == -1) {
            index_pivot = nums.length - 1;

        }

        int start = 0;
        int end = index_pivot;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }

        start = index_pivot + 1;
        end = nums.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public int getPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if ((mid + 1 != nums.length) && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if ((mid - 1 != -1) && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                if ( (start + 1 != nums.length) && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                if ((end - 1 != -1) && nums[end] < nums[end - 1] ) {
                    return end - 1;
                }
                end--;
            }else if ((nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[end] < nums[mid]))) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        Problem10 pb = new Problem10();

        int[] arr = { 4, 5, 6, 3, 2, 1 };
        boolean i = pb.search(arr, 2);

        System.out.println(i);
    }
}

/*
    Input
    nums =
    [1]
    target =
    0
    Output
    false
    Expected
    false
    ---------------------
    nums =
    [1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1]
    target =
    2
    Output
    true
    Expected
    true
    ----------------------
    nums =
    [1,3]
    target =
    0
    Output
    false
    Expected
    false
*/
