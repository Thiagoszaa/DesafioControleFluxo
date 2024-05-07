import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class Contador {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parametro: ");
        int primeiro = scanner.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int segundo = scanner.nextInt();

        try {
            contar (primeiro , segundo);

        } catch (ParametroInvaException e) {
            System.err.println("O segundo paramentro deve ser maior que o primeiro");
        }

    }

    static void contar (int primeiro, int segundo) throws ParametroInvaException {
        if (primeiro >= segundo) {
            throw new ParametroInvaException();
            }
        int contagem = segundo - primeiro;

        for (int i = 0; i < contagem; i++) {
            System.out.println("Numero:  " + (i + 1)  + " Contagem : " + (primeiro + i));

             }

       }


 }

