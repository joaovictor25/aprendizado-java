package service;

import core.Processo;

//Para retornar uma string com os erros
public class ProcessoService{
        public String validar(Processo processo){
            String erros = "";

            if(processo.getNumProcesso().isBlank()){
                erros = erros + "O campo número de processo precisa preencher | ";
            }
            if(processo.getCliente().isBlank()){
                erros = erros + "O campo cliente precisa preencher | ";
            }
            if(erros.isEmpty()){
                erros = "OK";
            }
            return erros;
        }
}