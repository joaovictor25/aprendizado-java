import java.util.Scanner;

public class EntradaDados{
    Scanner teclado = new Scanner(System.in);
    private int cenario;
    private int anexo;
    private double faturamento;

    public void setCenario(){
        while(true){
            try{
                cenario = Integer.parseInt(teclado.nextLine());
                if(cenario <= 4){
                    break;
                }else{
                    System.out.println("[Opção errada! Escolha uma opção presente no menu]");
                }

            }catch(NumberFormatException e){
                System.out.println("[Opção errada! Digite um numero]");
            }
        }

    }
    public int getCenario(){
        return cenario;
    }


    public void setAnexo(){
        while(true){
            try{
                anexo = Integer.parseInt(teclado.nextLine());
                if(anexo <= 5){
                    break;
                }else{
                    System.out.println("[Opção errada! Escolha uma opção presente no menu]");
                }

            }catch(NumberFormatException e){
                System.out.println("[Opção errada! Digite um numero]");
            }
        }
    }
    public int getAnexo(){
        return anexo;
    }


    public void setFaturamento(){
        while(true){
            try{
                faturamento = Double.parseDouble(teclado.nextLine());
                break;
            }catch(NumberFormatException e){
                System.out.println("[Erro: Digite o valor correto]");
            }
        }
    }
    public double getFaturamento(){
        return faturamento;
    }
}