public class problem1 {

    public static void main(String[] args) {

        boolean printed = false;
        for(int a = 1; a <= 20; a++ ){

            if(a % 3 == 0){
                System.out.print("Fizz");
                printed = true;
            }
            if(a%5 == 0){
                System.out.print("Buzz");
                printed = true;
            }
            if(!printed)
                System.out.print(a);

            System.out.println();
            printed=false;
        }



    }

}
