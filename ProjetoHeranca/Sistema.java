package ProjetoHeranca;

public class Sistema{
    public static void main(String args[]){
        Pessoa p = new Pessoa();

        p.setNome("Joao");
        p.setEmail("joao@joao.com.br");
        p.setTelefone("065452211");

        System.out.println(p.exibir());

        Estudante e = new Estudante();
        e.setNome("Jose");
        e.setEmail("jose@jose.com.br");
        e.setTelefone("954452222");
        e.setNumeroMatricula(06004611);
        e.setCurso("Ciência da Computação");

        System.out.println(e.exibir());
    }
}