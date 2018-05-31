public class problem3 {
    public static void main(String[] args) {
        String frase = "Racecar";
        frase = frase.toLowerCase();
        boolean palindrome = true;
        int b,e,l;
        b=0;
        e= frase.length() -1;
        if(e % 2 == 0){
            l = e/2 ;
        }else{
            l = (e - 1) / 2;
        }
       for( ; b < l; b++){
            if(frase.charAt(b) != (frase.charAt(e))){
                palindrome = false;
                break;}
                e--;
        }
        System.out.println(palindrome);
    }
}
