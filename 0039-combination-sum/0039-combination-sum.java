import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        // Start the recursion: (index, current target, current path, result)
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums, int target, List<Integer> path, List<List<Integer>> result) {
        // 1. BASE CASES
        if (target == 0) {
            // We found a valid combination! Add a COPY to the result.
            result.add(new ArrayList<>(path));
            return;
        }
        if (target < 0 || index == nums.length) {
            // We overshot the target or ran out of numbers. Stop.
            return;
        }

        // 2. CHOICE 1: PICK the number at 'index'
        path.add(nums[index]);
        // Note: we stay at 'index' because we can reuse the same number!
        backtrack(index, nums, target - nums[index], path, result);

        // 3. THE BACKTRACK STEP: "Undo" the pick
        // This is crucial. We must remove the last element to clean up for the next branch.
        path.remove(path.size() - 1);

        // 4. CHOICE 2: SKIP the number at 'index'
        // Move to the next number in the array.
        backtrack(index + 1, nums, target, path, result);
    }
}