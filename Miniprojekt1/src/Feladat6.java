public class Feladat6 {
    public static void Array_compare(int[] array1, int[] array2){
        if (array1.length != array2.length){
            System.out.println("The two arrays aren't equal.");
            return;
        }else {
            for(int i = 0; i < array1.length; i+=1){
                if (array1[i] != array2[i]){
                    System.out.println("The two arrays aren't equal.");
                    return;
                }
            }
            System.out.println("The two arrays are equal.");
            }
        }
    public static void main(String[] args) {
        int[] array1 = {1, 4, 5, 32};
        int[] array2 = {1, 4, 5, 32};
        int[] array3 = {1, 4, 5, 33};
        int[] array4 = {1, 4, 5,};
        int[] array5 = {1, 3, 5, 32};
        System.out.println(array1[3]);
        Array_compare(array1,array2);
        Array_compare(array1,array3);
        Array_compare(array1,array4);
        Array_compare(array1,array5);


    }
}
