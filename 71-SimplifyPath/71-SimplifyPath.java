// Last updated: 7/10/2026, 9:48:07 AM
class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        for (String s : path.split("/")) {
            if (s.equals("") || s.equals(".")) continue;
            if (s.equals("..")) {
                if (!st.isEmpty()) st.pop();
            } else st.push(s);
        }
        return "/" + String.join("/", st);
    }
}