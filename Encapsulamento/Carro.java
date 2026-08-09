//Regra geral
// Atributos PRIVATE  E METODOS PUBLIC 

public class Carro{
        private String marca;
        private String modelo;
        private String cor;
        private int ano;
        private double km;
        protected double preco;

        public void setMarca(String novaMarca){
            try{
                this.marca = novaMarca;
            }catch(NumberFormatException e){
                System.out.println("Erro: Valor inserido ["+novaMarca+"] esta incoreto.");
            }
        }
        public String getMarca(){
            return marca;
        }


        public void setModelo(String novoModelo){
            try{
                modelo = novoModelo;
            }catch(NumberFormatException e){
                System.out.println("Erro: Valor inserido ["+novoModelo+"] esta incoreto.");
            }
        }
        public String getModelo(){
            return modelo;
        }


        public void setCor(String novaCor){
            try{
                cor = novaCor;
            }catch(NumberFormatException e){
                System.out.println("Erro: Valor inserido ["+novaCor+"] esta incoreto.");
            }
        }
        public String getCor(){
            return cor;
        }


        public void setAno(String novoAno){
            try{
                ano = Integer.parseInt(novoAno);
            }catch(NumberFormatException e){
                System.out.println("Erro: Valor inserido ["+novoAno+"] esta incoreto.");
            }
        }
        public int getAno(){
            return ano;
        }


        public void setKM(String novoKM){
            try{
                km = Double.parseDouble(novoKM);
            }catch(NumberFormatException e){
                System.out.println("Erro: Valor inserido ["+novoKM+"] esta incoreto.");
            }
        }
        public double getKM(){
            return km;
        }


        public void setPreco(String novoPreco){
            try{
                preco = Double.parseDouble(novoPreco);
            }catch(NumberFormatException e){
                System.out.println("Erro: Valor inserido ["+novoPreco+"] esta incoreto.");
            }
        }
        public double getPreco(){
            return preco;
        }
}