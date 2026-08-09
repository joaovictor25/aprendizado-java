public class Carro{
        private String marca;
        private String modelo;
        private String cor;
        private String ano;
        private String km;
        protected String preco;


        public Carro(String modelo, String marca, String cor, String ano, String km, String preco){
            this.marca = marca;
            this.modelo = modelo;
            this.cor = cor;
            this.ano = ano;
            this.km = km;
            this.preco = preco;
        }

        public String getMarca(){
            return marca;
        }

        public String getModelo(){
            return modelo;
        }

        public String getCor(){
            return cor;
        }

        public String getAno(){
            return ano;
        }

        public String getKM(){
            return km;
        }

        public String getPreco(){
            return preco;
        }
}