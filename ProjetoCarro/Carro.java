public class Carro{
        String marca;
        String modelo;
        String cor;
        int ano;
        int km;
        double preco;

        //Criar um botão para exibir as informações
        void exibirAnuncio(){
            System.out.println("Anuncio do carro:");
            System.out.println(marca+" - "+modelo);
            System.out.println("Cor: "+cor+" Ano: "+ano+" Km: "+km+" Preço: "+preco);
        }
}