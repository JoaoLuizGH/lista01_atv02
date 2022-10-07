import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Informe um número: ");
        numero = teclado.nextInt();

        teclado.close();

        System.out.println("O numero informado foi: " + numero);
    }
}
