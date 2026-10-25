/*
 * DATE: 26/10/2026
 *
 * PROBLEM LINK: https://www.geeksforgeeks.org/problems/adding-one2529/1
 * PROBLEM STATEMENT: adding one to array
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 * adding one to the last index of array and makking the array work like counting
 * __________________________________________________
 * 
 * __________________________________________________
 *
 */

import java.util.ArrayList;

class adding1toarr{
    ArrayList<Integer> addOne(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                break;
            }
            arr[i] = 0;
        }
        if (arr[0] == 0) {
            result.add(1); // Add the leading 1
            for (int i = 0; i < n; i++) {
                result.add(0);
            }
            return result;
        }
        for (int val : arr) {
            result.add(val);
        }

        return result;
    }
}
