class Solution {
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        Map<String, List<String>> dp = new HashMap<>();

        return memo(words, groups, 0, -1, dp);
    }

    private List<String> memo(String[] words, int[] groups, int idx, int prev, Map<String, List<String>> dp) {
        if(idx >= words.length) return new ArrayList<>();
        String key = idx + "," + prev;

        if(dp.containsKey(key)) return dp.get(key);

        List<String> skip = memo(words, groups, idx + 1, prev, dp);

        List<String> take = new ArrayList<>();
        if(prev == -1 || (groups[idx] != groups[prev] && checkHammingDist(words[idx], words[prev]))) {
            take.add(words[idx]);
            take.addAll(memo(words, groups, idx + 1, idx, dp));
        }

        dp.put(key, ((take.size() > skip.size()) ? take : skip));
        return dp.get(key);
    }

    private boolean checkHammingDist(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int count = 0;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) count++;

            if(count > 1) return false;
        }

        return count <= 1;
    }
}