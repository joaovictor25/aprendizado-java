import java.util.Scanner;

public class DoWhile{
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int teclado = Scanner.nextInt();

        int cont = 1;

        //O laço executa uma vez, mas encera quando While verifica que a expreção é falsa 
        do{
            System.out.println(teclado+" X "+cont+" = "+ (teclado*cont));
            cont++;
        }while(cont <= 10);
    }
}