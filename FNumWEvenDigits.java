package LeetCode.Arrays101;

public class FNumWEvenDigits {
    
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            String str = Integer.toString(num);
            if (str.length() % 2 == 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));    
    }
}
