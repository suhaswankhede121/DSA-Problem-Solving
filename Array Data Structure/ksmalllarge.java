import java.util.Arrays;

public class ksmalllarge {
   public static void main(String[] args) {
       int []arr={1,3,4,5,6,7,8};
       int k=3;
       System.out.println(KthLarge(arr,k));
       System.out.println(Kthsmall(arr,k));
    }

    static int Kthsmall(int []arr,int k){
       Arrays.sort(arr);
        int min=arr[k-1];
        return min;
    }
      static int KthLarge(int []arr,int k){
        Arrays.sort(arr);
        int max=arr[arr.length-k];
        return max;
    }

    
}
