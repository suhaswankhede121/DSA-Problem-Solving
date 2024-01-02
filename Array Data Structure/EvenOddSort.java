public class EvenOddSort {
    public static void main(String[] args) {
        int []arr={1,3,2,4,5,8};
        int [] ans=sorting(arr);
        print(ans);
        System.out.println("hello");
    }

    static int [] sorting(int []arr){
       int left=0;
       int right=arr.length-1;
      while(left<right){
        if(arr[left] % 2 ==1 && arr[right] % 2 ==0){
            swap(arr, right, left);
            left++;
            right--;
        }  
        else if(arr[left] % 2 ==1){
            left++;
           // right--;
        }
        
       else if(arr[right] % 2 ==0){
            right--;
            //left++;
     
       }
    }
       return arr;
    }

    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
