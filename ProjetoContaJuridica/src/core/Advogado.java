package ProjetoContaJuridica.src.core;

public class Advogado extends Pessoa{
    private String numoab;
    private String especialidade;


    public Advogado(int id, String nome, String email, String telefone, String cpf, String numoab, String especialidade){
        super(id, nome, email, telefone, cpf);
        this.numoab = numoab;
        this.especialidade = especialidade;
    }

    public void setNumoab(String numoab){
        this.numoab = numoab;
    }
    public String getNumoab(){
        return numoab;
    }


    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return especialidade;
    }

    public String exibir(){
        return "OAB: "+numoab+"\nEspecialidade: "+especialidade;
    }
}