class Solution {
    public int majorityElement(int[] nums) {
       int king = 0;
        int votes = 0;
        for (int num : nums) {
            if (votes == 0) {
                king = num;   
            }
            if (num == king) {
                votes++;
            } else {
                votes--;
            }
        }
        return king;   
    }
}