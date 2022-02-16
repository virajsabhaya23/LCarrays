package LCarrays;

public class DuplicateZeros{
    public static void duplicateZeros(int[] arr) {

        int Zs = 0, n = arr.length;
        for(int i:arr){
            if(i==0)
                Zs++;
        }
        for(int i=n-1,j=n-1+Zs;i>=0;i--,j--){
            if(j<n)
                arr[j]=arr[i];
            if(arr[i] == 0 && --j < n)
                arr[j] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}