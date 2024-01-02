public class strictGreaterEle {
    public static void main(String[] args) {
        int[]arr={2,4,5,56,4,5,9,7,5,2,5,6,5,5};
    int t=9;
    int count=0;
    for(int i=0;i<arr.length;i++){
       if(arr[i]>t){
          count++;
        }
     }
     System.out.println(count);
    }
    
}
