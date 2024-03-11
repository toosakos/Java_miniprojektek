import java.util.Arrays;

public class Feladat5 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 6, 3, 4};
        System.out.println(Arrays.toString(array));
        int buffer = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = buffer;
        System.out.println(Arrays.toString(array));
    }
}
