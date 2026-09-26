class Solution {
    public boolean makeEqual(String[] words) {
     int[] count = new int[26];
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                count[ch - 'a']++;
            }
        }
        for (int freq : count) {
            if (freq % words.length != 0) {
                return false;
            }
        }
        return true;    
    }
}