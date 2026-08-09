import java.util.Scanner;

public class ArraysUnidimensionais{
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);
        double[] notas = new double[5];

        for(int cont = 0; cont < 5; cont++){
            System.out.print("Digite a nota: ");
            double nota = Scanner.nextDouble();
            notas[cont] = nota;
        }

        for(int c = 0; c < 5; c++){
            System.out.println("Valor da nota "+(c+1)+": "+ notas[c]);
        }

    }
}