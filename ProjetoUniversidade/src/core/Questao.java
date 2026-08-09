package ProjetoUniversidade.src.core;

public class Questao {
    protected String resposta;
    protected String enunciado;

    public Questao(String enunciado, String resposta){
        super();
        this.resposta = resposta;
        this.enunciado = enunciado;
    }

    public String aplicarQuestao(){
        return "Q: "+this.enunciado;
    }

    public boolean corrigirQuestao(String respAluno){
        return this.resposta.equals(respAluno);
    }

    public void setResposta(String resposta){
        this.resposta = resposta;
    }
    public String getResposta(){
        return resposta;
    }


    public void setEbubcuado(String enunciado){
        this.enunciado = enunciado;
    }
    public String getEnunciado(){
        return enunciado;
    }

}
