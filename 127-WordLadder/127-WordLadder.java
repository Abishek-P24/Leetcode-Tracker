// Last updated: 7/10/2026, 9:46:38 AM
class Solution {
    public int ladderLength(String begin, String end, List<String> words) {
        Set<String> set = new HashSet<>(words);
        if (!set.contains(end)) return 0;
        Queue<String> q = new LinkedList<>();
        q.offer(begin);
        int step = 1;
        while (!q.isEmpty()) {
            for (int s = q.size(); s > 0; s--) {
                char[] a = q.poll().toCharArray();
                for (int i = 0; i < a.length; i++) {
                    char old = a[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        a[i] = c;
                        String nxt = new String(a);
                        if (nxt.equals(end)) return step + 1;
                        if (set.remove(nxt)) q.offer(nxt);
                    }
                    a[i] = old;
                }
            }
            step++;
        }
        return 0;
    }
}