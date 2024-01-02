/*
 Algorithm:
 1. make a frequency array of size 10^5+1
 2. initially frequency array should be zero for all elements so,
 mark it as to checking ofn arrays eleemnts present then mark as 1 and so on
 like fre[arr[i]]++;
 3. get queries from the users and check for al, queries 
 4. if freq[x]>0 :
    present
    else:
    not present
 */

import java.util.Scanner;

public class QueriesArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
         int arr[]=new int[n];
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Queries");
        int q=sc.nextInt();
        int ans[]=frequency(arr);
        while(q>0){
            System.out.println("Enter the number to be checked");
            int x=sc.nextInt();
            if(ans[x]>0){
                System.out.println("Present");
            }else{
                System.out.println("Abscent");
            }
            q--;
        }
    }

    static int[] frequency(int []arr){
        int freq[]=new int[1000005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
}
