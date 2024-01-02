public class lastOccuranceOfEle {
     public static void main(String[] args) {
       System.out.println(lastocc());
     }
     static int lastocc(){
         int[]arr={2,4,5,56,4,5,9,7,5,2,5,6,5,5};
        int t=2;
        int ans=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==t){
            ans=i;
            ans=-1;
           }
        }
         for(int i=0;i<arr.length;i++){
           if(arr[i]==t){
            ans=i;
           }
        }
        
        return ans;
     }
}
