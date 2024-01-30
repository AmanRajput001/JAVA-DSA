package Notes_8_Binary_search_Questions;

public class Problem11 {
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

    public int search(int []arr){
        int index_pivot = -1;
        if (arr.length == 1) {
            index_pivot = 0;
        }else if(arr.length == 2){
            if(arr[1] > arr[0]){
                index_pivot = 1;
            }else{
                index_pivot = 0;
            }
        }
        else{
            index_pivot = getPivot(arr);
        }

        return index_pivot + 1;
    }
    public static void main(String[] args) {
        Problem11 pb = new Problem11();

        int[] arr = { 4, 4, 5, 6, 6,6,6, 7, 0, 1, 2, 3, 4, 4, 4};
        int i = pb.search(arr);

        System.out.println(i);
    }
}
