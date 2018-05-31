import java.util.HashMap;

public class problem2 {

    public static void main(String[] args) {
        String frase = "Encyclopedia";
        frase = frase.toLowerCase();
        char[] fr = frase.toCharArray();
        int i;
        HashMap<String, Integer> map= new HashMap<>();
        for(char a: fr){
            if(map.containsKey(String.valueOf(a))){
                i = map.get(String.valueOf(a));
                map.replace(String.valueOf(a), i, i+1);
            }else{
                map.put(String.valueOf(a),1);
            }
        }
        System.out.println(map.toString());
    }

}
