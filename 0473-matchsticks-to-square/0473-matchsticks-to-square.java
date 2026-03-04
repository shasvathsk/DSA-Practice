class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int m : matchsticks) sum += m;
        if (sum % 4 != 0 || matchsticks.length < 4) return false;
        int target = sum / 4;
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        int[] sides = new int[4];
        return backtrack(matchsticks, sides, 0, target);
    }

    private boolean backtrack(int[] matchsticks, int[] sides, int index, int target) {
        if (index == matchsticks.length) {
            return true; 
        }

        int currentStick = matchsticks[index];

        for (int i = 0; i < 4; i++) {
            if (sides[i] + currentStick <= target) {
                sides[i] += currentStick;
                if (backtrack(matchsticks, sides, index + 1, target)) {
                    return true;
                }
                sides[i] -= currentStick;
            }
            if (sides[i] == 0) break;
        }
        return false;
    }
    private void reverse(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }
}
    