import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int [][]ans=pascal(n);
         for(int i=0;i<ans.length-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+ans[i][j]);
            }
            System.out.println();
         }
    }

    static int[][] pascal(int n){
        int [][] ans=new int[n][];
        for(int i=0;i<n;i++){
            //  every ith row has i+1th column
            ans[i]=new int[i+1];

            // first and last elements should be 1

            ans[i][0]=ans[i][i]=1;

            // trverse for all the 
            for(int j=1;j<i;j++){
              ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
       return ans;
    }
}
