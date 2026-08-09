package ProjetoContaEspecial.src.core;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numeroConta, String cpf, String nome, double saldo, double limite){
        super(numeroConta, cpf, nome, saldo);
        this.limite = limite;
    }

    public String toString(){
        return super.numeroConta+" - "+super.cpfTitular+" - "+super.nomeTitular+" - "+super.saldo+" - "+limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }
    public double getLimite(){
        return limite;
    }

    @Override
    public boolean debitar(double valor){
        if(super.saldo + this.limite >= valor){
            super.saldo -= valor;
            return true;
        }
        return false;
    }
}