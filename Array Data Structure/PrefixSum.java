import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={1,2,3,4};
        int ans[]=new int[arr.length];
        int k=0;
       ans[0]=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            ans[i]=ans[i-1]+arr[i];
            //arr[i]+=arr[i-1];
         
        }
        // for(int i: ans){
        //     System.out.print(" "+i);
        // }
        System.out.println("Enter no of queries");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("Enter start and end");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum=ans[r]-ans[l-1];
            System.out.println("Sum : "+sum);
            q--;
        }

    }
}
