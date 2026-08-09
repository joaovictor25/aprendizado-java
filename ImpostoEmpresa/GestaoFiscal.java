public class GestaoFiscal{
    public static void main(String args[]){
        //Instanciando a class em Objeto
        Imposto imposto = new Imposto();
        EntradaDados entrada = new EntradaDados();



        System.out.println("----------------------------------------------------");
        System.out.println("-- Simule o pagamento de impostos da sua empresa --");
        System.out.println("----------------------------------------------------");
        
        System.out.println("Escolha um dos Cenários pré-definidos:\n" +
        "[1] - MEI\n" +
        "[2] - PEQUENA EMPRESA\n" +
        "[3] - MÉDIA EMPRESA\n" +
        "[4] - GRANDE EMPRESA\n" 
        );
        entrada.setCenario(); //Chamando o metodo que cuida da entrada de dados
       
        System.out.println("----------------------------------------------------");

        System.out.println("Anexo do Simples Nacional:\n" +
        "[1] - Anexo I - Comércio (ex: lojas, mercearias)\n" +
        "[2] - Anexo II - Indústria (ex: fábricas, produção)\n" +
        "[3] - Anexo III - Serviços gerais (ex: academias, escolas)\n" +
        "[4] - Anexo IV - Serviços técnicos (ex: consultoria, TI)\n" +
        "[5] - Anexo V - Serviços profissionais (ex: médicos, advogados)\n" 
        );
        entrada.setAnexo(); //Chamando o metodo que cuida da entrada de dados

        System.out.println("----------------------------------------------------");

        System.out.println("Faturamento Mensal (R$): ");
        entrada.setFaturamento(); //Chamando o metodo que cuida da entrada de dados

        //Pasando como parametro os metodos que retornão os valores tratados
        System.out.println(imposto.calculoImposto(entrada.getCenario(), entrada.getAnexo(), entrada.getFaturamento()));
        //Metodo calculoImposto cuida da parte logica
    }
}