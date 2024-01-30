package Notes_8_Binary_search_Questions;
/*
 Problem 2:
 floor of number
 array = [2, 3, 5, 9, 14, 16, 18], target = 15
 floor :- find greatest number in array less than or equal to target.
 => answer :- 14

 target = 4, answer :- 3
*/

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };

        System.out.println(floor(arr, -1));
    }

    public static int floor(int[] nums, int target) {
        if (nums.length != 0) {
            if (!(target < nums[0])) {
                boolean isAsec = true;
                if (nums[0] > nums[1]) {
                    isAsec = false; // means descending
                }

                int start = 0;
                int end = nums.length - 1;
                int mid = -1;

                while (start <= end) {
                    mid = (start + (end - start) / 2);

                    if (isAsec) {
                        if (target > nums[mid]) {
                            start = mid + 1;
                        } else if (target < nums[mid]) {
                            end = mid - 1;
                        } else if (target == nums[mid]) {
                            return nums[mid];
                        }
                    } else {
                        if (target < nums[mid]) {
                            start = mid + 1;
                        } else if (target > nums[mid]) {
                            end = mid - 1;
                        } else if (target == nums[mid]) {
                            return nums[mid];
                        }
                    }
                }
                /*
                 * start > end then loop breaks
                 * then, end here is the element smaller than target.
                 */
                return nums[end];
            } else {
                return Integer.MIN_VALUE;
            }
        }
        return -1;
    }
}
