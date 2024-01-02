class PatitionEqual{
    public static void main(String[] args) {
        int []arr={1,3,2,4,5};
        System.out.println(equalPart(arr));
    }

    static int totalSum(int []arr){
        int tsum=0;
        for(int i=0;i<arr.length;i++){
         tsum+=arr[i];
        }
        return tsum;
    }

    static boolean equalPart(int []arr){
        int pre=0;
        int sfix=0;
        int tsum=totalSum(arr);
        for(int i=0;i<arr.length;i++){
            pre+=arr[i];
            sfix=tsum-pre;
            if(sfix==pre){
                return true;
            }
        }
        return false;
    }
}