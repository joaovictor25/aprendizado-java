package ui;

import core.Processo;
import core.Status;
import service.ProcessoService;

public class MainClass{
    public static void main(String args[]){
        Processo p = new Processo(1L,"","", "Teresópolis","Trabalhista",Status.APROVADO);
        ProcessoService v = new ProcessoService();

        //Validação se os dados do objeto estão corretos
        String status = v.validar(p);
        if(status.equals("OK")){
            System.out.println(p.getCliente());
            System.out.println(p.getStatus());
        }else{
            System.out.println("Dados invalidos!!!!\n "+status);
        }

    }
}