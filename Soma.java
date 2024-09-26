import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        Scanner scanner = new Scanner(System.in);

        int INDICE = 12;
        int soma =0;
        int k=1;
        while(k<INDICE){
            k=k+1;
            soma += k;

        }
        System.out.println(soma);
    }
}