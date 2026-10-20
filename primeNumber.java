/*
 * DATE: 16/10/2026
 *
 * PROBLEM LINK: https://www.geeksforgeeks.org/problems/prime-number2314/1
 * PROBLEM STATEMENT:prime number
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 * using fo rand if command finding wheather the given number is prime or not...
 * __________________________________________________
 * 
 * __________________________________________________
 *
 */
class primeNumber{
    static boolean isPrime(int n) {
        // code here
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/i;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}