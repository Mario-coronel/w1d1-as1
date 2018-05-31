public class problem4 {
    public static void main(String[] args) {
        String frase = "Mario";
        int a = 0;
        reverse(frase,1);

    }

    public static void reverse(String frase, int letter){
        if(frase.length() > letter){
            reverse(frase,letter+1);
        }
        System.out.print(frase.charAt(letter-1));
    }
}
