package BinarySearch.BS_on_1DArray;

/*
    Name : Peak element in Array

    Problem Statement: Given an array of length N. Peak element is defined as the element greater than both of its neighbors. Formally, if ‘arr[i]’ is the peak element, ‘arr[i – 1]’ < ‘arr[i]’ and ‘arr[i + 1]’ < ‘arr[i]’. Find the index(0-based) of a peak element in the array. If there are multiple peak numbers, return the index of any peak number.

    Example 1:
    Input Format: arr[] = {1,2,3,4,5,6,7,8,5,1}
    Result: 7
    Explanation: In this example, there is only 1 peak that is at index 7.

    Example 2:
    Input Format: arr[] = {1,2,1,3,5,6,4}
    Result: 1
    Explanation: In this example, there are 2 peak numbers that are at indices 1 and 5. We can consider any of them.

    Example 3:
    Input Format: arr[] = {1, 2, 3, 4, 5}
    Result: 4
    Explanation: In this example, there is only 1 peak that is at the index 4.

    Example 4:
    Input Format: arr[] = {5, 4, 3, 2, 1}
    Result: 0
    Explanation: In this example, there is only 1 peak that is at the index 0.

    Approach : bruteforce  

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reason: We have not used any extra data structures, this makes space complexity, even in the worst case as O(1).

    Reference: https://takeuforward.org/data-structure/peak-element-in-array/

 */

public class Q13_bruteforce {

    static int findPeakElement(int[] arr){

        int n = arr.length;;
        for(int i=0; i<n; i++){

            if(( i==0 || arr[i] > arr[i-1]) && ( i==n-1 || arr[i] > arr[i+1])){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr =  {1,2,3,4,5,6,7,8,5,1};
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }   
}
