package Notes_8_Binary_search_Questions;

/*  Problem 3:
    Given a characters array letters that is sorted in non-decreasing order and a character
    target , return the smallest character in the array that is larger than target .

    Note that the letters wrap around.

    For example, if target == 'z' and letters == ['a', 'b'] , the answer is

    Example 1:

    Input: letters = ["c","f","j"], target = "a"
    Output: "c"
*/

public class Problem3 {
    public static void main(String[] args) {
        char[] arr = { 'A', 'B', 'C', 'F', 'G', 'I', 'J', 'X', 'Z' };

        System.out.println(celling(arr, 'A'));
    }

    public static char celling(char[] ch, int target) {
        int start = 0;
        int end = ch.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (target >= ch[mid]) {
                start = mid + 1;
            } else if (target < ch[mid]) {
                end = mid - 1;
            }

        }
        return ch[start % ch.length]; // 4 % 4 => 0, 1 % 4 => 1
    }
}
