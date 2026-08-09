public class Imposto{
    double calculoImposto(int cenario, int anexo, double faturamento){
        double impostoMensal = 0;
        switch(cenario){
            case 1:
                switch(anexo){
                    case 1:
                        impostoMensal = faturamento * 0.04;
                    case 2:
                        impostoMensal = faturamento * 0.045;
                    case 3:
                        impostoMensal = faturamento * 0.06;
                    case 4:
                        impostoMensal = faturamento * 0.045;
                    case 5:
                        impostoMensal = faturamento * 0.155;
                }
            case 2:

            case 3:

            case 4:
        }
        return impostoMensal;
    }
}