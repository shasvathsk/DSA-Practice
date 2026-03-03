class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, s, new ArrayList<>(), 0);
        return res;
    }

    void backtrack(List<List<String>> res, String s, List<String> cur, int start) {
        if (start == s.length()) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (palindrome(s, start, i)) {
                cur.add(s.substring(start, i + 1)); 

                backtrack(res, s, cur, i + 1); 

                cur.remove(cur.size() - 1);
            }
        }
    }

    boolean palindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
