public class bubblesort {

    public static void main(String[] args) {

        int[] nums = {64, 34, 25, 12, 22, 11, 90};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}