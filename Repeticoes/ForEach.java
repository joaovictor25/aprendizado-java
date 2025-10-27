import java.util.Scanner;

public class ForEach{
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);
        int vet[] = new int[5];

        System.out.println("");

        for(int elemento: vet){
            System.out.println("Elemento do vetor = "+elemento);
        }
    }
}