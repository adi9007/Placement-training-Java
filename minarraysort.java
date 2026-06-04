public class minarraysort {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 7, 9, 1, 5};
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("The minimum element in the array is: " + min);

        
    }
}
