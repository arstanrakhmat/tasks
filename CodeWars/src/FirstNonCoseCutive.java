import java.util.ArrayList;
import java.util.Scanner;

public class FirstNonCoseCutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        int num;

        while (sc.hasNextInt()) {
            num = sc.nextInt();
            nums.add(num);
        }

        for (int i = 0; i < nums.size() - 1; i++) {
            if ((nums.get(i + 1) - nums.get(i)) > 1) {
                System.out.println(nums.get(i + 1));
                return;
            }
        }
    }
}
