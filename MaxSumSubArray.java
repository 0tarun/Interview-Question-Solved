public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("MaxSumSubArray  :" + MaxSum(nums) + "");

    }

    public static int MaxSum(int[] nums) {
        int curr = 0, max = nums[0];
        for (int num : nums) {
            curr += num;
            max = curr > max ? curr : max;
            if (curr < 0) {
                curr = 0;
            }
        }
        return max;
    }
}