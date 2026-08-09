public class UaiBiMotors{
    public static void main(String args[]){
        Carro c1 = new Carro();

        
        c1.setModelo("2.0");
        c1.setMarca("Corola");
        c1.setCor("Preto");
        c1.setAno("2026");
        c1.setKM("0");
        c1.setPreco("10.000");


        System.out.println(c1.getMarca());
        System.out.println(c1.getModelo());
        System.out.println(c1.getCor());
        System.out.println(c1.getAno());
        System.out.println(c1.getKM());
        System.out.println(c1.getPreco());

    }
}