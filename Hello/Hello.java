import java.util.Scanner;

public class Hello{
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Olá, mundo!");
        String nome = Scanner.nextLine();
        System.out.print(nome);
    }
}