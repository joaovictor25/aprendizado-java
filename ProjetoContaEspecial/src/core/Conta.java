package ProjetoContaEspecial.src.core;

public class Conta{
    protected int numeroConta;
    protected String cpfTitular;
    protected String nomeTitular;
    protected double saldo;

    public Conta(int numeroConta, String cpfTitular, String nomeTitular, double saldo){
        super();
        this.numeroConta = numeroConta;
        this.cpfTitular = cpfTitular;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String toString(){
        return this.numeroConta+" - "+this.cpfTitular+" - "+this.nomeTitular+" - "+this.saldo;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public int getNumeroConta(){
        return numeroConta;
    }


    public void setCpfTitula(String cpfTitular){
        this.cpfTitular = cpfTitular;
    }
    public String getCpfTitular(){
        return cpfTitular;
    }


    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    public String getNomeTitular(){
        return nomeTitular;
    }


    public double getSaldo(){
        return saldo;
    }


    public void creditar(double valor){
        this.saldo += valor;
    }

    public boolean debitar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;+-

    }