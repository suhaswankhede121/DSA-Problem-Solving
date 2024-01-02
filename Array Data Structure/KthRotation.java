public class KthRotation {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
       // int []ans=rotate(arr, 2);
       int []ans=rotateInplace(arr, 2);
        for(int i:ans){
            System.out.print(" "+i);
        }
    }


    //very important questions for placement point of view
    static int[] rotate(int []arr,int k){
        int n=arr.length;
        int ans[]=new int[n];
        k=k%n;
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j]=arr[i];
            j++;
        }
        for(int i=0;i<n-k;i++){
            ans[j]=arr[i];
            j++;
        }
        return ans;
    }


    //most important approach
    static int[] rotateInplace(int []arr,int k){
        int n=arr.length;
        k=k%n;
          reverse(arr, 0, n-k-1);
          reverse(arr, n-k, n-1);
          reverse(arr, 0, n-1);
          return arr;
    }

    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverse(int []arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}
