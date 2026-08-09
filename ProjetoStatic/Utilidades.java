//Static em metodos é mais usado em utilidades. Exemplo: class Math do java
//static em variaveis quando quer consultar algo portodos os modulos do sistema

public class Utilidades{
    //Se eu quiser ter uma biblioteca de metodos, coloco todos os metodos em uma class e declaro com static
    public static int soma(int x, int y){
        return x + y;
    }
    //public = Global acessovel por todos
    //static = UNICO, uma unica variavel para toda a execução do sistema
    //final = Nunca muda o valor
    public static final int VALOR = 10;
}