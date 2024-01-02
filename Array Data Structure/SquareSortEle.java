import java.util.Arrays;
import java.util.Comparator;

public class SquareSortEle {
    public static void main(String[] args) {
        int [] arr={1,2,3,-4,1,0};
        int []ans=square(arr);
        print(ans);
    }
   static int[]square(int []arr){
    int []ans=new int[arr.length];
    for(int i=0;i<arr.length;i++){
            ans[i]=arr[i]*arr[i];
    }
    // int i=0;
    // int j=ans.length-1;
    // while(i<j){
    //     swap(ans, j, i);
    //     // i++;
    //     // j--;
    // }
    Arrays.sort(ans);
     return ans;
   }
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }

    static void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
