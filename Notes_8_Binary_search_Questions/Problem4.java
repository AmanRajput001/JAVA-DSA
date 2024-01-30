package Notes_8_Binary_search_Questions;
/*  Problem 4:
    Given an array of integers nums sorted in ascending order, find the starting and
    ending position of a given target value.

    If target is not found in the array, return [-1, -1] .

    You must write an algorithm with 0(log n) runtime complexity.

    Example 1:

    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
*/

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 5, 6, 7, 7, 7,7, 7, 11, 12};
        int target = 7;

        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    public static int[] searchRange(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index[] = new int[2];

        index[0] = -1;
        index[1] = -1;


        // index[0]
        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                if (mid - 1 != -1 && target == arr[mid - 1]) {
                    start = 0;
                    end = mid - 1;
                    while (start <= end) {
                        int middle = (start + (end - start) / 2);

                        if (target > arr[middle]) {
                            start = middle + 1;
                        } else if (target < arr[middle]) {
                            end = middle - 1;
                        } else if (target == arr[middle]) {
                            index[0] = mid;
                            break;
                        }
                    }
                } else {
                    index[0] = mid;
                    break;
                }
            }
        }

        // index[1]
        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                if (mid + 1 != arr.length && target == arr[mid + 1]) {
                    end = arr.length - 1;
                    start = mid + 1;
                    while (start <= end) {
                        int middle = (start + (end - start) / 2);

                        if (target > arr[middle]) {
                            start = middle + 1;
                        } else if (target < arr[middle]) {
                            end = middle - 1;
                        } else if (target == arr[middle]) {
                            index[1] = mid;
                            break;
                        }
                    }
                } else {
                    index[1] = mid;
                    break;
                }
            }
        }

        return index;
    }

}
