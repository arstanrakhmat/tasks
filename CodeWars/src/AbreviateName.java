import java.util.Scanner;

public class AbreviateName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine().toUpperCase();
        String[] names = name.split(" ");

        System.out.println(names[0].charAt(0) + "." + names[1].charAt(0));
    }
}
