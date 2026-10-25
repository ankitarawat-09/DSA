/*
 * DATE: 23/10/2026
 *
 * PROBLEM LINK: https://www.geeksforgeeks.org/problems/sum-all-array-elements/1
 * PROBLEM STATEMENT:sum of array
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 * Sum of all elments present in the grp 
 * __________________________________________________
 * 
 * __________________________________________________
 *
 */

class sumarr{
    public int arraySum(int arr[]) {
                int total = 0;

                for (int i = 0; i < arr.length; i++) {
                    total = total + arr[i];
                }

                return total;
            
        }

    }

