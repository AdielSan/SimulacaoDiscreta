/**
 *
 * @author Adiel Nascimento - Universidade Federal do Pará - 2018
 */
public class ProblemaSexo {

    public static void main(String[] args) {
        int NumeroExperiencias = 100000; 
        int NumeroOvos = 10;
        int ContadorGeral = 0;
        int limite1 = 4, limite2 = 6;
        double probabilidade = 0.6;
        
        for (int i=0; i < NumeroExperiencias; i++){
            int contador = 0;
            
            for (int j=0; j<NumeroOvos; j++){
                if (Math.random() < probabilidade) contador++;
            }
            if (contador >= limite1 && contador <= limite2) ContadorGeral++;
        }
        double p = (double) ContadorGeral/NumeroExperiencias;
        System.out.print("Probabilidade: " + p);
    }
    