public class sortZeroOne {
    public static void main(String[] args) {
        int[]arr={1,0,0,0,0,1,1,1,1,0};
        int zeros=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeros++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(zeros>i){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }

        for(int i: arr){
            System.out.print(" "+i);
        }
    }
}
