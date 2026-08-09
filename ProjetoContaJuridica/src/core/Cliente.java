package ProjetoContaJuridica.src.core;

public class Cliente extends Pessoa{
    private String numProcesso;
    private String statusProcesso;
    public Cliente(int id, String nome, String email, String telefone, String cpf, String numProcesso, String statusProcesso){
        super(id, nome, email, telefone, cpf);
        this.numProcesso = numProcesso;
        this.statusProcesso = statusProcesso;
    }


        public String exibir(){
            return "Processo: "+numProcesso+"\nStatus: "+statusProcesso;
        }
}