import java.util.Scanner;

public class While{
    public static void main(String arg[]){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int teclado = Scanner.nextInt();
        int cont = 1;

        //O laço só continua se a expressão for verdadeira
        while(cont <= 10){
            System.out.println(teclado+" X "+cont+" = "+ (teclado*cont));
            cont++;
        }
    }
}