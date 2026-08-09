package ProjetoHeranca;

public class Estudante extends Pessoa{
    private int numeroMatricula;
    private String curso;


    public String exibir(){
        return nome+", "+email+", "+telefone+", "+numeroMatricula+", "+curso;
    }
    public void setNumeroMatricula(int numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }
    public int getNumeroMatricula(){
        return numeroMatricula;
    }


    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return curso;
    }
}