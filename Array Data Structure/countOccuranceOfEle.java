public class countOccuranceOfEle {
    public static void main(String[] args) {
        int[]arr={2,4,5,56,5,9,7,5,5,6,5,5};
        int count=0;
        int t=5;
        for(int i=0;i<arr.length;i++){
             if(arr[i]==t){
                count++;
             }
               
        }
        System.out.println(count);
    }
}
