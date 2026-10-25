/*
 * DATE: 22/10/2026
 *
 * PROBLEM LINK: https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1
 * PROBLEM STATEMENT:Reverse array in groups
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 * consecutive grp of array is reversed not the whole array
 * __________________________________________________
 * 
 * __________________________________________________
 *
 */


class reverseingrp{
    public void reverseInGroups(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}
