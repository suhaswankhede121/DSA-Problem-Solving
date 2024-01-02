public class findTargetEleInd {
    public static void main(String[] args) {
       System.out.println(position());
    }
    static int position(){
         int[]arr={2,4,5,56,5,9};
        int t=9;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                return i;
            }
        }
        return -1;
    }
}
