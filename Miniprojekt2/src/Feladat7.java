import java.util.Arrays;

public class Feladat7 {
    public static void main(String[] args) {
        int[] array = {7,5,9,3,7,9,4,5};

        System.out.print("Items with duplicates: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != Integer.MIN_VALUE) {
                boolean foundDuplicate = false;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == array[i]) {
                        foundDuplicate = true;
                        array[j] = Integer.MIN_VALUE;
                    }
                }
                if (foundDuplicate) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
