import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String palavra;

        System.out.println("Escreva uma palavra: ");
        palavra = scanner.next();

        for (int i = 0; i < palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }

        scanner.close();
    }

    

    
}



