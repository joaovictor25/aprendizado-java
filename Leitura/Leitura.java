import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = Scanner.nextLine();
        System.out.println("Seu nome é " + nome);

        System.out.println("Digite um número inteiro: ");
        int num = Scanner.nextInt();
        System.out.println("O número digitado foi "+num);

        System.out.println("Digite um valor Float: ");
        float f = Scanner.nextFloat();
        System.out.printf("O valor digitado foi: %.3f\n", f);

        System.out.println("Digite um valor double: ");
        double d = Scanner.nextDouble();
        System.out.printf("O valor digitado foi %.4f\n", d);
 
        //Forçar conversão
        System.out.println("Digite um númer: ");
        Double e = Double.parseDouble(Scanner.nextLine());
        System.out.printf("O valor é %.3f", e);
    }
}