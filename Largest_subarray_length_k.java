import java.util.*; 

public class Largest_subarray_length_k {

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int Sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            
            Sum += arr[i];

            
            if (Sum == k) {
                maxLen = i + 1;
            }

            
            if (hashMap.containsKey(Sum - k)) {
                maxLen = Math.max(maxLen, i - hashMap.get(Sum - k));
            }

            
            if (!hashMap.containsKey(Sum)) {
                hashMap.put(Sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,1,1,1,1,1};
        int k = 5;
        System.out.println("Length of the longest subarray: " + longestSubarrayWithSumK(arr, k));
    }
}

