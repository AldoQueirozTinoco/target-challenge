import java.util.Scanner;
public class Letra {
    public static void main(String[] args) {
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        string = string.toLowerCase();
       char letras[] = string.toCharArray();
        int letraA = 0;

        for(int i=0;i<string.length();i++){
            if (letras[i] == 'a') {
                letraA++;
            }
        }
        System.out.println(letraA);
    }
}