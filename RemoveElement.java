/*
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
package LCarrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i =0;
        int j =0;
        
        while(j < nums.length){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
            j++;
        } 
        
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
        for(int i:nums){
            System.out.print(nums[i]+" ");
        }
    }
}
