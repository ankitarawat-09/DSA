/*
 * DATE: 20/10/2026
 *
 * PROBLEM LINK: https://www.geeksforgeeks.org/problems/replace-all-0s-with-5/1
 * PROBLEM STATEMENT: REPLACE ALL 0 with 5
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 * in this code we have replaced all zeroes with five and have learn a new method replace  
 * __________________________________________________
 * 
 * __________________________________________________
 *
 */

class replace {
    public int convertFive(int n) {
        // code here
        String str=String.valueOf(n);
        str=str.replace('0','5');
        int output=Integer.parseInt(str);
        return output;
    }
}