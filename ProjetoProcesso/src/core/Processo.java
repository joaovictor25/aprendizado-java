package core;

public class Processo{
    private Long id;
    private String numProcesso;
    private String cliente;
    private String vara;
    private String classeProcessual;
    private Status status;

    public Processo(Long id, String numProcesso, String cliente, String vara, String classeProcessual, Status status){
        this.id = id;
        this.numProcesso = numProcesso;
        this.cliente = cliente;
        this.vara = vara;
        this.classeProcessual = classeProcessual;
        this.status = status;
    }


    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }


    public void setNumProcesso(String numProcesso){
        this.numProcesso = numProcesso;
    }
    public String getNumProcesso(){
        return numProcesso;
    }


    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    public String getCliente(){
        return cliente;
    }


    public void setVara(String vara){
        this.vara = vara;
    }
    public String getVara(){
        return vara;
    }


    public void setClasseProcessual(String classeProcessual){
        this.classeProcessual = classeProcessual;
    }
    public String getClasseProcessual(){
        return classeProcessual;
    }


    public void setStatus(Status status){
        this.status = status;
    }
    public Status getStatus(){
        return status;
    }
}