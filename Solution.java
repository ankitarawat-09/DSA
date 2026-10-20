/*
 * DATE: 14/10/2026
 *
 * PROBLEM LINK: https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
 * PROBLEM STATEMENT:reversing of array
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 using of for loop 
 * _____________________________________________
 * using scanner
 * __________________________________________________
 * optaining white spacing in result
 */
import java.util.Scanner;
public class Solution {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       
       int n=sc.nextInt();
        int[] a=new int[n];
     for(int i=0;i<n;i++){
       a[i]=sc.nextInt(); 
       }
        
        for(int i=n-1;i>=0;i--){
            if(i!=n-1){
                System.out.print(" ");
            }
          System.out.print(a[i]);
        }
        sc.close();
    }
    
}

        