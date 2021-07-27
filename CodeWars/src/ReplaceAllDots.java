import java.util.Scanner;

public class ReplaceAllDots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String smth = sc.nextLine();
        System.out.println(replacement(smth));
    }

    public static String replacement(String sentence) {

        return sentence.replaceAll("\\.", "-");
    }
}
