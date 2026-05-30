import java.util.*;

class Solution {
    public List<Boolean> getResults(int[][] queries) {

        int n = 0;
        for (int[] q : queries) {
            n = Math.max(n, q[1]);
        }

        TreeSet<Integer> obstacles = new TreeSet<>();
        obstacles.add(0);
        obstacles.add(n);

        SegmentTree seg = new SegmentTree(n);
        seg.update(0, n);

        List<Boolean> ans = new ArrayList<>();

        for (int[] q : queries) {
            if (q[0] == 1) {
                int x = q[1];
                Integer left = obstacles.lower(x);
                Integer right = obstacles.higher(x);

                if (left != null && right != null) {
                  
                    seg.update(left, right - left);

                    seg.update(left, x - left);
                    seg.update(x, right - x);
                }

                obstacles.add(x);
            } else {
              
                int x = q[1], sz = q[2];
                if (x - sz < 0) {
                    ans.add(false);
                } else {
                    int maxGap = seg.query(0, x - sz);
                    ans.add(maxGap >= sz);
                }
            }
        }
        return ans;
    }

    static class SegmentTree {
        int[] tree;
        int size;

        SegmentTree(int n) {
            size = n;
            tree = new int[4 * n];
        }

        void update(int pos, int val) {
            update(1, 0, size, pos, val);
        }

        private void update(int node, int l, int r, int pos, int val) {
            if (l == r) {
                tree[node] = val;
                return;
            }
            int mid = (l + r) / 2;
            if (pos <= mid) update(2 * node, l, mid, pos, val);
            else update(2 * node + 1, mid + 1, r, pos, val);
            tree[node] = Math.max(tree[2 * node], tree[2 * node + 1]);
        }

        int query(int ql, int qr) {
            return query(1, 0, size, ql, qr);
        }

        private int query(int node, int l, int r, int ql, int qr) {
            if (qr < l || ql > r) return 0;
            if (ql <= l && r <= qr) return tree[node];
            int mid = (l + r) / 2;
            return Math.max(query(2 * node, l, mid, ql, qr),
                            query(2 * node + 1, mid + 1, r, ql, qr));
        }
    }
}
