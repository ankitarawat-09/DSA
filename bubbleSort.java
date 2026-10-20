/*
 * DATE: 19/10/2026
 *
 * PROBLEM LINK: https://www.geeksforgeeks.org/problems/bubble-sort/1
 * PROBLEM STATEMENT:sorting array using bubblesort
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 * here we have sorted the array using the concept of bubble sort 
 * __________________________________________________
 * 
 * __________________________________________________
 *
 */

class Solution {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
if (!swapped) {
                break;
            }
        }
    }
}