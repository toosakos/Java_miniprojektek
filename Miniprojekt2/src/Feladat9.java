import java.lang.reflect.Array;
import java.util.Arrays;

public class Feladat9 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i+=1){
            for (int j = 0; j < array.length; j+=1){
                if (i == j){
                    System.out.print(i+" ");
                }else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }

    }
}
