public class KadanesAlgorithm {
 // if the final output becomes negative then we will update current sum to zero.

 public static void subarraySum(int num[])
 {
     int maxSum = Integer.MIN_VALUE;
     int currSum = 0;
     for(int i=0; i<num.length; i++)
     {
        currSum = currSum + num[i];
        if(currSum < 0)
        {
            currSum = 0;
        } 
        maxSum = Math.max(currSum, maxSum);
     }
     System.out.println("Our Max Subassar Sum is : " + maxSum);
 }
    public static void main(String[] args) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        subarraySum(num);
    }
}
