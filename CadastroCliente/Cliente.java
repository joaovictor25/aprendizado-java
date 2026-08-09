import java.util.Scanner;

public class Cliente{
    Scanner teclado = new Scanner(System.in);

    String nome;
    String sobrenome;
    String sexo;
    String estado;
    String cidade;
    String endereco;
    String cep;
    int idade;
    String telefone;

    void cadastrarCliente(){
        System.out.println("Digite seu primeiro nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite seu primeiro sobrenome: ");
        sobrenome = teclado.nextLine();

        System.out.println("Digite seu sexo: ");
        sexo = teclado.nextLine();

        System.out.println("Digite sua cidade: ");
        cidade = teclado.nextLine();

        System.out.println("Digite seu estado: ");
        estado = teclado.nextLine();

        System.out.println("Digite seu endereço: ");
        endereco = teclado.nextLine();

        System.out.println("Digite seu CEP: ");
        cep = teclado.nextLine();

        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();

        System.out.println("Digite seu telefone: ");
        telefone = teclado.nextLine();
    }

    void verCadastro(){
        System.out.println("---------------------------------------");
        System.out.println("------- "+nome+" foi cadastrado --------");
        System.out.println("---------------------------------------");
        System.out.println("Primeiro nome: "+nome);
        System.out.println("Sobrenome: "+sobrenome);
        System.out.println("Sexo: "+sexo);
        System.out.println("Cidade: "+cidade);
        System.out.println("Estado: "+estado);
        System.out.println("Endereço: "+endereco);
        System.out.println("Cep: "+cep);
        System.out.println("Idade: "+idade);
        System.out.println("Telefone: "+telefone);
    }
}