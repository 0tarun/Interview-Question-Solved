
public class Remove_Ele {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int target = 3;
       System.out.println(Remove_Element(nums, target)); 

    }

    public static int Remove_Element(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

}
