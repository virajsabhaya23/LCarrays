package LCarrays;

public class SquaresSortedArr {
    public static int[] sortedSquares(int[] nums) {
        
        int[] sq = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            sq[i] = nums[i]*nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            int temporary;
            for (int j = i + 1; j < nums.length; j++) {
                if (sq[i] > sq[j]) {
                    temporary = sq[i];
                    sq[i] = sq[j];
                    sq[j] = temporary;
                }
            }
        }
        return sq; 
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] sortedarr = sortedSquares(nums);
        for(int i = 0; i < sortedarr.length; i++) {
            System.out.print(sortedarr[i] + " ");
        }
    }
}
