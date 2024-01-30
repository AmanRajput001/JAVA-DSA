package Notes_8_Binary_search_Questions;
/*
 Problem 1:
 Celling of number
 array = [2, 3, 5, 9, 14, 16, 18], target = 15
 celling :- find smallest number in array greater or equal to target.
 => answer :- 16

 target = 4, answer :- 5
*/

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 8, 9, 100, 101, 102, 150, 180, 190 };

        System.out.println(celling(arr, 200));
    }

    public static int celling(int[] nums, int target) {
        if (nums.length != 0) {
            if (!(target > nums[nums.length - 1])) {
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
                 * then, start here is the element greater than target.
                 */
                return nums[start];
            } else {
                return Integer.MAX_VALUE;
            }
        }
        return -1;
    }
}
