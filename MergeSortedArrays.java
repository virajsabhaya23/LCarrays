public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        int i=0,j=0,k=0;
        
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                nums3[k++] = nums1[i++];
            }
            else{
                nums3[k++] = nums2[j++];
            }
        }
        
        while(i < m){
            nums3[k++] = nums1[i++];
        }
        while(j < n){
            nums3[k++] = nums2[j++];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,}
        merge(nums1, 3, nums2, 3)
        System.out.println(nums3);
    }
}
