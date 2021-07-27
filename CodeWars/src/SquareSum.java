import java.util.ArrayList;
import java.util.Scanner;

public class SquareSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        int inputNum;

        while (sc.hasNextInt()) {
            inputNum = sc.nextInt();
            nums.add(inputNum);
        }

        System.out.println(squareSum(nums));
    }

    public static Integer squareSum(ArrayList<Integer> nums) {
        int total = 0;

        for (int i = 0; i < nums.size(); i++) {
            total += nums.get(i) * nums.get(i);
        }

        return total;
    }
}
