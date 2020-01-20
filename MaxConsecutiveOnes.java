
/*
Given a binary array, find the maximum number of consecutive 1s in this array.
*/
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = 0, currmax = 0;
        for (int i : nums) {
            if (i == 1) {
                currmax++;
                continue;
            } else {
                max = Math.max(max, currmax);
                currmax = 0;
            }
        }
        max = Math.max(max, currmax);
        return max;
    }
}
