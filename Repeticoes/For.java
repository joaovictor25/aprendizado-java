import java.util.Scanner;

public class For{
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int teclado = Scanner.nextInt();

        for(int cont = 1; cont <= 10; cont++){
            System.out.println(teclado+" X "+cont+" = "+ (teclado*cont));
        }

    }
0}