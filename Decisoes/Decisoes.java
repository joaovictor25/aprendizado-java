public class Decisoes{
    public static void main(String args[]){
        int A = 2;
        int B = 3;
        int C = 2;
        int D = 6;
        
        if(B > C && D > A){
            if((C + D) > (A + B) && C >= 0 && D >= 0){
                System.out.print("Valores aceitos");
            }
        }else{
            System.out.print("Valores não aceitos");
        }
    }
}