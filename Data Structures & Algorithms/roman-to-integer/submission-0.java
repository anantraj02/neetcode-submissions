class Solution {
    public int romanToInt(String s) {
      int[] value = new int[128];

        value['I'] = 1;
        value['V'] = 5;
        value['X'] = 10;
        value['L'] = 50;
        value['C'] = 100;
        value['D'] = 500;
        value['M'] = 1000;

        int result = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (value[s.charAt(i)] < value[s.charAt(i + 1)]) {
                result -= value[s.charAt(i)];
            } else {
                result += value[s.charAt(i)];
            }
        }

        result += value[s.charAt(s.length() - 1)];

        return result;   
    }
}