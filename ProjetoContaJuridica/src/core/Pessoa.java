package ProjetoContaJuridica.src.core;

public class Pessoa{
    protected int id;
    protected String nome;
    protected String email;
    protected String telefone;
    protected String cpf;

    public Pessoa(int id, String nome, String email, String telefone, String cpf){
        this. id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    //Metodo que retona a string 
    public String toString(){
        return nome+" - " + email +" - "+ telefone +" - "+ cpf;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }


    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }


    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }


    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }


    public String exibir(){
        return "Nome: "+nome+ "\nE-mail: "+email+"\n Telefone: "+telefone+"\nCPF: "+cpf;
    }
}