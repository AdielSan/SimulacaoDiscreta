import java.util.Random;

public class Main {  

    public static void main(String[] args) {
        int NumeroExp = 10000000;
        int s = 0;
        int Cara = 0, Coroa = 0;
        
        Random r = new Random();
        
              for (int i=0; i < NumeroExp; i++){
              //Declarar uma moeda de duas faces
              int moedahonesta = r.nextInt(2) + 1;
            
              
                if (moedahonesta == 1){
                    Cara++; 
                }
              
                if (moedahonesta == 2){
                    Coroa++; 
                }   
                    
              }
              
              double probCara = (double) Cara/NumeroExp;
              probCara = probCara * 100;
              
              double probCoroa = (double) Coroa/NumeroExp;
              probCoroa = probCoroa * 100;
              
        System.out.print ("Número de vezes que deu Cara: " + Cara + " vezes com probabilidade igual à: " + probCara +"%\n");    
        System.out.print ("Número de vezes que deu Coroa: " + Coroa + " vezes com probabilidade igual à: " + probCoroa +"%\n");   
    } 
}