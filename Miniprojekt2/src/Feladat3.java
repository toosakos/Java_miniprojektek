public class Feladat3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("ababbcdc");
        StringBuilder buffer = new StringBuilder();
        for (int i = 1; i <= str.length()-1;i++){
            if (buffer.toString().contains(""+str.charAt(i-1))){
                continue;
            }else {
                buffer.append(str.charAt(i-1));
            }
        }
        str = buffer;
        System.out.println(str);
    }
}
