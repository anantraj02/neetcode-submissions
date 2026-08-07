class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       boolean[] allowedChars = new boolean[26];

        for (char ch : allowed.toCharArray()) {
            allowedChars[ch - 'a'] = true;
        }

        int count = 0;

        for (String word : words) {

            boolean valid = true;

            for (char ch : word.toCharArray()) {
                if (!allowedChars[ch - 'a']) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;  
    }
}