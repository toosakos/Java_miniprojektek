public class Feladat6 {
    public static void main(String[] args) {
        int[] array = new int[]{7, 5, 3, 9, 4};
        int min = array[0];
        int max = array[0];
        for (int item : array) {
            if (item > max) {
                max = item;
            } else if (item < min) {
                min = item;
            }
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}
