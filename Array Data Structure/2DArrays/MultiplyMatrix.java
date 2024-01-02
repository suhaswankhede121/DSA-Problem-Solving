import java.util.Scanner;

public class MultiplyMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of rows and columns Matrix 1");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("enter elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter value of rows and column");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
         int [][]arr2=new int[r2][c2];
         System.out.println("Enter values");
         for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
     int mul[][]=new int[r][c2];
        for(int i=0;i<r;i++){
            for(int j=0;j<c2;j++){
                if(c!=r2){
                 return;
                }
                for(int k=0;k<r2;k++){
                 mul[i][j]+=(arr[i][k]*arr2[k][j]);
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c2;j++){
                System.out.print(" "+mul[i][j]);
            }
            System.out.println();
        }
    }
}
