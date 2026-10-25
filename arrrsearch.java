/*
 * DATE: 24/10/2026
 *
 * PROBLEM LINK: https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
 * PROBLEM STATEMENT:Array  search
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 * searching if the element is present in array or not if present than at what position
 * __________________________________________________
 * 
 * __________________________________________________
 *
 */

class arrsearch{
            public int search(int arr[], int x) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == x) {
                        return i;
                    }
                }

                return -1;
            }
        }

