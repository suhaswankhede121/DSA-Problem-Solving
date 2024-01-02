import java.util.Arrays;

public class smallestNdLargest {
    public static void main(String[] args) {
        int []arr={1,2,10};
        int ans[]=smallLarge(arr);
       System.out.println("small "+ans[0]);
       System.out.println("Larget "+ans[1]);
       
    }

    static int[]smallLarge(int []arr){
         Arrays.sort(arr);
        int ans[]={arr[0],arr[arr.length-1]};
        return ans;
    }

}
