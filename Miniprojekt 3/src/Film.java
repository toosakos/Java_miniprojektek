import java.util.ArrayList;
import java.util.Arrays;

public class Film implements Comparable{
    private String cim;
    private int ar;
    private int[] velemenyek;

    public Film(String cim, int ar) {
        this.cim = cim;
        this.ar = ar;
        this.velemenyek = new int[20];
    }

    public String getCim() {
        return cim;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void Velemenyezes(int velemeny){
        if (velemeny < 1 || velemeny > 5){
            System.out.println("Vélemény szám intervallumon kívűl!");
        }else {
            for(int i = 0; i < (velemenyek.length-1);i+=1){
                velemenyek[i] = velemeny;
            }
        }

    }


    public double Atlag(){
        if (velemenyek[0] == 0){
            System.out.println("Nincs vélemeny erről a filmről.");
        }
        int ossz = 0;
        for (int velemeny:velemenyek){
            ossz += velemeny;
        }
        return ossz/(velemenyek.length);
    }

    @Override
    public String toString() {
        return "Film címe: " + this.cim + ", Film ára: " + this.ar;
    }

    @Override
    public int compareTo(Object o) {
        int s1 = ((Film) o).getAr();
        int s2 = this.ar;
        if(s1<s2){
            return -1;
        } else if (s1>s2) {
            return 1;
        } else {
            return 0;
        }
    }
}
