import java.lang.Character;
public class Feladat5 {
     static void Stringcheck(String string){
        for (int i = 1; i < string.length(); i++) {
            if(!Character.isLetter(string.charAt(i))){
                System.out.println(string + " nem alfabetikus");
                return;
            }
        }
        System.out.println(string + " alfabetikus");
    }
    public static void main(String[] args) {
        String string1 = "Almafa";
        String string2 = "Almafa2";
        Stringcheck(string1);
        Stringcheck(string2);
        }
}
