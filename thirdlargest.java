/*
 * DATE: 25/10/2026
 *
 * PROBLEM LINK: https://www.geeksforgeeks.org/problems/third-largest-element/1
 * PROBLEM STATEMENT:third largest
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 * finding the third largest number in the following array
 * __________________________________________________
 * 
 * __________________________________________________
 *
 */
import java.util.List;

class thirdlargest{
    int thirdLargest(List<Integer> arr) {
        int n = arr.size();

        // If the array has fewer than 3 elements, a third largest does not exist
        if (n < 3) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = arr.get(i);

            // Shift values down sequentially if num is larger or equal
            if (num >= first) {
                third = second;
                second = first;
                first = num;
            } else if (num >= second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        return third;
    }
}
