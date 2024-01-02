public class checkSort {
    public static void main(String[] args) {
      System.out.println(isSorted());
    }
    static boolean isSorted(){
         int[]arr={2,4,5,1};
         boolean flag=true;
    for(int i=1;i<=arr.length;i++){
        if(arr[i]<arr[i-1]){
            flag=false;
            break;
        }
      }
      return flag;
    }
}

