public class SquareEveryDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n) {
        String s = n + "";
        String[] digits = s.split("");
        StringBuilder output = new StringBuilder();

        for (String digit : digits) {
            int i = Integer.parseInt(digit);
            output.append((int) Math.pow(i, 2));
        }

        return Integer.parseInt(output.toString());
    }
}