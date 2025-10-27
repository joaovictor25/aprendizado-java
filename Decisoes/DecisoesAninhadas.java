import java.util.Scanner;

public class DecisoesAninhadas{
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);

        int code;
        int quant;

        System.out.print("Digite o código: ");
        code = Integer.parseInt(Scanner.nextLine());

        System.out.print("Digite a quantidade: ");
        quant = Integer.parseInt(Scanner.nextLine());

        if(code == 1){
            System.out.println("Quantidade: "+ quant +" | Valor do cachorro Quente: "+ (4 * quant) );
        }else if(code == 2){
            System.out.println("Quantidade: "+ quant +" | Valor do X-salada: "+ (4.50 * quant) );
        }else if(code == 3){
            System.out.println("Quantidade: "+ quant +" | Valor do X-bacon: "+ (5 * quant) );
        }else if(code == 4){
            System.out.println("Quantidade: "+ quant +" | Valor da Torrada simples: "+ (2 * quant) );
        }else if(code == 5){
            System.out.println("Quantidade: "+ quant +" | Valor do Refrigerante: "+ (1.50 * quant) );
        }
    }
}