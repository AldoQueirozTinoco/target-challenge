import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        int temp;
        int bef=0;
        int next =1;

        while(next != numero){
            temp = next;
            next += bef;
            bef = temp;
            if(numero==0){
                break;
            }
            else if(next>numero){
                System.out.println("Não pertence");
                break;
            }
        }
        if(numero==next || numero==0){
            System.out.println("Pertence");
        }
    }
}