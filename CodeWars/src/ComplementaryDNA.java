public class ComplementaryDNA {
    public static void main(String[] args) {

    }

    public static String makeComplement(String dna) {
        //Your code
        char[] dnaArray = dna.toCharArray();

        for (int i = 0; i < dnaArray.length; i++) {
            dnaArray[i] = complementaryThings(dnaArray[i]);
        }

        return new String(dnaArray);
    }

    public static char complementaryThings(char c) {
        switch (c) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
        }

        return c;
    }
}
