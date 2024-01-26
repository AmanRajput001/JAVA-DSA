package Notes_6_Linear_searching;

/*
    Given an array nums of integers, return how many of them contain an even
    number of digits.
    
    Example 1:
    
    Input: nums = [12,345, 2, 6, 7896]
    Output: 2
    Explanation:
    12 contains 2 digits (even number of digits).
    345 contains 3 digits (odd number of digits).
    2 contains 1 digit (odd number of digits).
    6 contains 1 digit (odd number of digits).
    7896 contains 4 digits (even number of digits).
    Therefore only 12 and 7896 contain an even number of
    digits.
*/

public class Problem1 {
    public static void main(String[] args) {
        int []nums = {12,345, 2, 6, 7896};

        Problem1 pb = new Problem1();
        System.out.println("Numbers of integers contain even number of digits: " + pb.findNumbers(nums));
    }

    public int findNumbers(int []nums){
        int count = 0;
        for(int element : nums){
            if(element < 0){ // if number is negative
                element *= -1; // make it positive
            }
            //Checking number contain even number of digit or not
            int digit = 0;            
            while(element != 0){
                digit += 1;
                element = element / 10;
            }

            if(digit %2 == 0){
                count += 1;
            }
        }
        return count;
    }
}
