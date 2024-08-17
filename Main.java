import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        for(i = 2; i <= 100; i++){
            boolean Asal = true;
            for (int j = 2; j < i; j++ ){
                if(i % j == 0){
                    Asal = false;
                    break;
                }
            }
            if (Asal){
                System.out.print(" " +i);
            }
        }
    }
}