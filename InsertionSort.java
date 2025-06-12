public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 64, 25, 12, 22, 11 };
        for (int num : InsertionSortAlgo(nums)) {
            System.out.print(num + " ");
        }
    }

    public static int[] InsertionSortAlgo(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }
}