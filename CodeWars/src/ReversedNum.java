import java.util.Scanner;

public class ReversedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String temp = Integer.toString(num);
        int[] nums = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            nums[i] = temp.charAt(i) - '0';
        }

        System.out.print("[");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + ",");
        }
        System.out.print("]" + "\n");
    }
}