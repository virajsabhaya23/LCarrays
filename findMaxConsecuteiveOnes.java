package LCarrays;

public class findMaxConsecuteiveOnes{
    public static int findMaxConsecuteiveOnes(int[] nums){
        
        int count = 0;
        int result = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                result = Math.max(count, result);
            }
            else
                count = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};

        System.out.println(findMaxConsecuteiveOnes(nums));
    }
}