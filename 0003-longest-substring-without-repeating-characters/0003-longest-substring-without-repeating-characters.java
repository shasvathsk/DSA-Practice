class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0, maxLen = 0;
        HashSet<Character> window = new HashSet<>();

        while (right < n) {
            char c = s.charAt(right);
            // If duplicate, shrink window from left
            while (window.contains(c)) {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}