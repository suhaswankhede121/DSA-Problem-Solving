import java.util.Scanner;

public class SpriralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter rows and columns");
        // int r=sc.nextInt();
        // int c=sc.nextInt();
        // int [][]arr=new int[r][c];
        // System.out.println("enter Elements");
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // int [][]ans=new int[r][c];
        //    ans=spiral(arr, r, c);
        //  for(int i=0;i<ans.length;i++){
        //     for(int j=0;j<ans.length;j++){
        //         System.out.print(" "+ans[i][j]);
        //     }
        // }
        System.out.println("Enter size");
        int n=sc.nextInt();
        int [][]ans=new int[n][n];
        //ans=CountSpiral(n);
        ans=spiral(ans, n, n);
         for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                System.out.print(" "+ans[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] spiral(int [][]arr,int r,int c){
        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalEle=0;
        while(totalEle > r * c){
            // top-> lc-rc
              for(int j=leftCol;j<=rightCol && totalEle > r * c;j++){
                System.out.print(" "+arr[topRow][j]);
                totalEle++;
              }
              topRow++;
            // rc-> top-bottom
              for(int i=topRow;i<=bottomRow && totalEle > r * c;i++){
                System.out.print(" "+arr[i][rightCol]);
                totalEle++;
              }

              rightCol--;
            // bo-> rc-lc
              for(int j=rightCol;j>=leftCol && totalEle > r * c ;j--){
                System.out.print(" "+arr[bottomRow][j]);  
                totalEle++;                           
                }

              bottomRow--;
            //lc-> bo-top

              for(int i=bottomRow;i>=topRow && totalEle > r * c;i--){
                System.out.print(" "+arr[i][leftCol]);
                totalEle++;
              }

              leftCol++;
        }
        return arr;
    }

    static int[][] CountSpiral(int n){
        int [][]arr=new int[n][n];

        int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1;
        int curr=1;
        while(curr <= n*n){
            // top-> lc-rc
              for(int j=leftCol;j<=rightCol && curr <= n*n;j++){
                arr[topRow][j]=curr++;
              }
              topRow++;
            // rc-> top-bottom
              for(int i=topRow;i<=bottomRow && curr < n*n;i++){
                arr[i][rightCol]=curr++;
              }

              rightCol--;
            // bo-> rc-lc
              for(int j=rightCol;j>=leftCol && curr < n*n ;j--){
                 arr[bottomRow][j]=curr++;                         
                }

              bottomRow--;
            //lc-> bo-top

              for(int i=bottomRow;i>=topRow && curr < n*n;i--){
                arr[i][leftCol]=curr++;
              }

              leftCol++;
        }
        return arr;

    }
}
