/*
 * DATE: 21/10/2026
 *
 * PROBLEM LINK: https://docs.google.com/spreadsheets/d/15RXxj_5oSLuLDFDlRhIzOyoBs7L-vNZkpU7sD0sPDbY/edit?gid=0#gid=0
 * PROBLEM STATEMENT:   rotate array by one 
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 * rotating array from last place to the index one.
 * __________________________________________________
 * 
 * __________________________________________________
 *
 */


class rotate {
    public void rotate(int[] arr) {
        int n = arr.length;

        int last = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }
}
