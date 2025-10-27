public class Contas{
    public static void main(String args[]){
        int a, b, c;
        float d;
        double e;
        
         a = 27;
         b = 4;
         c = a + b;

         System.out.println("Valor de c: " + c);
         c = a - b;
         System.out.println("Valor de c: " + c);
         c = a * b;
         System.out.println("A multiplicação de b X a é: " + c);
         c = a / b;
         System.out.println("A divisão de a por b é: " + c);
         c = a % b;
         System.out.println("Resto da divisão: " + c);

        //d = (float)1.0; //Converção explicita para float

         d = 1.0f; //Funciona apenas para numeros e indica que se trata de um valor float
         System.out.println("O valor de d: " + d);
         d = 1.0f/2;
         System.out.println("O valor de d: "+d);
         System.out.printf("Valor de d: %.4f\n", d);

         //Exibir número com formatação 
         System.out.printf("Valor de a = %d, b = %d, c = %d, d = %f", a, b, c, d);
    }
}