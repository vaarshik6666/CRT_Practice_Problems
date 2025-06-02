import java.util.Scanner;

public class Sorting_Non_Repeating_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "");
        String[] strNums = input.split(",");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i].trim());
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j == 0 || nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (int k = 0; k < i; k++) {
            System.out.print(nums[k] + " ");
        }
        sc.close();
    }
}