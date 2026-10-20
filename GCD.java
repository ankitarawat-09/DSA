/*
 * DATE: 18/10/2026
 *
 * PROBLEM LINK: https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
 * PROBLEM STATEMENT:GCD ( commonly known as HCF )
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 * in this question we have find out what is the highest common factor( Gratest Common Divisor) of two numbers using 
 * while loop
 * __________________________________________________
 * 
 * __________________________________________________
 *
 */

class GCD {
    public static int gcd(int a, int b) {
        // code here
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
