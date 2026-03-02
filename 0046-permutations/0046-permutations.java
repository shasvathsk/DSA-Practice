import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        // Start backtracking with an empty tempList
        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }

    private void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums) {
        // 1. BASE CASE: If we match the length, it is a permutation
        if (tempList.size() == nums.length) {
            // Important: We must create a NEW list because tempList keeps changing
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        // 2. RECURSIVE STEP: Iterate through the numbers
        for (int number : nums) {
            
            // Skip if we get the same element (already used in current path)
            if (tempList.contains(number)) {
                continue;
            }

            // ADD the new element
            tempList.add(number);

            // GO BACK to try other elements (Recursive call)
            backtrack(resultList, tempList, nums);

            // REMOVE the element (The Backtrack step)
            tempList.remove(tempList.size() - 1);
        }
    }
}