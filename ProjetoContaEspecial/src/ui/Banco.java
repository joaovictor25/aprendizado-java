package ProjetoContaEspecial.src.ui;

import ProjetoContaEspecial.src.core.Conta;
import ProjetoContaEspecial.src.core.ContaEspecial;
public class Banco{
    public static void main(String args[]){
        Conta c = new Conta(1111, "175-5447-878-18","Joao",100);
        ContaEspecial e = new ContaEspecial(2222, "4444444", "Joao", 100, 1000);

        //System.out.println(c);

        System.out.println(e);

        if(c.debitar(10)){
            System.out.println("Debito efetuado");
        }else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println(e);
    }
}