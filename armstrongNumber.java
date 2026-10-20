/*
 * DATE:17/10/2026
 *
 * PROBLEM LINK: https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
 * PROBLEM STATEMENT:Armstrong number
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 * using mathematical algorithms finding if the numbers itself individuals cubes sum is equal to the number or not 
 * __________________________________________________
 * 
 * __________________________________________________
 *
 */
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int num=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d*d;
            n=n/10;
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}
