import java.util.*;

public class Solution {
    Map<String, List<Integer>> memo = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        if (memo.containsKey(expression)) {
            return memo.get(expression);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftPart = expression.substring(0, i);
                String rightPart = expression.substring(i + 1);

                
                List<Integer> leftResults = diffWaysToCompute(leftPart);
                List<Integer> rightResults = diffWaysToCompute(rightPart);

                // Combine results based on the current operator
                for (int l : leftResults) {
                    for (int r : rightResults) {
                        if (c == '+') res.add(l + r);
                        else if (c == '-') res.add(l - r);
                        else if (c == '*') res.add(l * r);
                    }
                }
            }
        }

        // Base case: If no operators were found, the expression is a single number
        if (res.isEmpty()) {
            res.add(Integer.parseInt(expression));
        }

        // Store in memo before returning
        memo.put(expression, res);
        return res;
    }
}