package Arrays_java;
//import Arrays_java.array_basic;
public class Kadanes_algo {
    static int subArray(int arr[], int n)
    {
        // initializing currSum to 0 and maxsum to min_val, denoting an empty subarray.
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for( int i=0;i<n;i++)
        {
           currSum+=arr[i];
           // taking the max of maxsum and the currsum of the subarray.
           maxSum=Math.max(maxSum,currSum);
           // checking if the currSum becomes negative.
           if(currSum<0)
           currSum=0;
        }
    return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-1,-2,-2,5,-7,-3,-1};
        printArray(arr,7);
        // maximum sum of subArray in array.
        System.out.println("Maximum sum in the sub-array of array is: "+subArray(arr,7));
    }
    static void printArray(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
