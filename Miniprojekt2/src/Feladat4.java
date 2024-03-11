public class Feladat4 {
    public static void main(String[] args) {
        String input = "aaabbbcc";
        String compressed = compressString(input);
        System.out.println("Compressed String: " + compressed);
    }

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder compressedString = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                compressedString.append(currentChar);
                compressedString.append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        compressedString.append(currentChar);
        compressedString.append(count);

        return compressedString.toString();
    }
}