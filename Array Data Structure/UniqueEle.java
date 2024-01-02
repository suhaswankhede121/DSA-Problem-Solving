public class UniqueEle {
    public static void main(String[] args) {
        int []arr={1,2,2,3,3};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   arr[i]=-1;
                   arr[j]=-1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
           if(arr[i]>0){
            ans=arr[i];
           }
        }
        System.out.println(ans);
    }
}
