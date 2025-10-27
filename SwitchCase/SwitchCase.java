import java.util.Scanner;

public class SwitchCase{
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digit o número: ");
        int opc = Scanner.nextInt();

        switch(opc){
            case 1:
                System.out.println("A opção escolhida foi a 1");
                break;
            case 2:
                System.out.println("A opção escolhida foi a 2");
                break;
            case 3:
                System.out.println("A opção escolhida foi a 3");
                break;
            case 4:
                System.out.println("A opção escolhida foi a 4");
                break;
        }
    }
}