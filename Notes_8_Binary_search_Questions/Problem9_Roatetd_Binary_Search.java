package Notes_8_Binary_search_Questions;

/*
    Problem 9:
    Rotated Array:-  array = [2, 4, 5, 7, 8, 9, 10, 12]

        Rotation 1: [ 12, 2, 4, 5, 7, 8, 9, 10]
        Rotation 2: [ 10, 12, 2, 4, 5, 7, 8, 9]
        Rotation 3: [ 9, 10, 12, 2, 4, 5, 7, 8]

    => Find Pivot:- where this array order is change here pivot is = 12.
*/

/*
    case 1:- [3,4,5,6,7,0,1,2] => only [7,0] is in decsending order => mid > mid + 1 => mid
    case 2:- [3,4,5,6,7,0,1,2] => lets say mid element = 0, then mid < (mid-1) => mid - 1
    case 3:- start > mid => that mean [4,5,6,3,2,1] 4 > 3 than pivot lies in [4,5,6] end = mid - 1
    case 4:- start < mid => that mean [3,4,5,6,2] 3 < 5 than pivot lies in [6,2] start = mid + 1
    */

public class Problem9_Roatetd_Binary_Search {
    public static void main(String[] args) {
        Problem9_Roatetd_Binary_Search pb = new Problem9_Roatetd_Binary_Search();

        int[] arr = { 3,4,5,6,7,0,1,2 };
        int i = pb.search(arr, 2);

        System.out.println(i);
    }

    public int search(int[] nums, int target) {
        int index_pivot = getPivot(nums);

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
                return mid;
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
                return mid;
            }
        }
        return -1;
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
            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else if (nums[start] < nums[mid]) {
                start = mid + 1;
            }
        }

        return -1;

    }

}
