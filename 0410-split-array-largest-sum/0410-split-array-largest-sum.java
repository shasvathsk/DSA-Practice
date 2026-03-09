class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num); // minimum possible largest sum
            right += num;               // maximum possible largest sum
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                right = mid; // try smaller largest sum
            } else {
                left = mid + 1; // need larger largest sum
            }
        }
        return left;
    }
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int count = 1; // number of subarrays
        int currSum = 0;
        for (int num : nums) {
            if (currSum + num > maxSum) {
                count++;
                currSum = num;
                if (count > k) return false;
            } else {
                currSum += num;
            }
        }
        return true;
    }
}
