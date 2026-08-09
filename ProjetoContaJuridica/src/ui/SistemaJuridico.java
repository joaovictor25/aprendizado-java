package ProjetoContaJuridica.src.ui;

import ProjetoContaJuridica.src.core.Pessoa;
import ProjetoContaJuridica.src.core.Advogado;
import ProjetoContaJuridica.src.core.Cliente;

public class SistemaJuridico{
    public static void main(String args[]){
        Pessoa[] pessoa = new Pessoa[2];

        pessoa[0] = new Advogado(1, "Joao", "joao@joao.com", "(21)9987542211","176-542-888-18", "5455-87","Trabalhista");

        pessoa[1] = new Cliente(1, "Joao", "joao@joao.com", "(21)9987542211","176-542-888-18","88888888888888888","COMPLETO");


        for(int i = 0; i <= 2; i++){
            System.out.println(pessoa[i].exibir());
            System.out.println("----------------------------------");
        }

        // System.out.println("-------------------------------------");

        // System.out.println("Advogado: \n"+a.exibir());

        // System.out.println("-------------------------------------");

        // System.out.println("Cliente: \n"+c.exibir());

        // System.out.println("-------------------------------------");

        // System.out.println("Cliente: \n"+p.exibir());


    }
}