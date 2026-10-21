import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) return false;

int[] counts = new int[26];
for (int i = 0; i < s.length(); i++) {
    counts[s.charAt(i) - 'a']++;
    counts[t.charAt(i) - 'a']--;
}

for (int c : counts) {
    if (c != 0) return false;
}
return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna