public class UaiBiMotors{
    public static void main(String args[]){
        Carro c1 = new Carro();

        c1.modelo = "Porche";
        c1.marca = "Moderno";
        c1.cor = "Preto";
        c1.ano = 2026;
        c1.km = 10000;
        c1.preco = 10000000;

        //System.out.print(c1.preco);
        //System.out.println(c1.marca);
        //System.out.println(c1.cor);
        //System.out.println(c1.ano);
        //System.out.println(c1.km);
        //System.out.println(c1.modelo);
        c1.exibirAnuncio();

    }
}