package industria;

import java.util.Random; 

public class Industria {
        public static void main(String[] args) {
      double Xc = 149.5, Mi = 150,sigma = 0.2, media = 0;
      int  NumExp = 10000000, cont = 0;
      Random r = new Random();
      r.setSeed(13237464);
  
        for (int t=0; t<NumExp; t++){
            double x = r.nextGaussian() * sigma + Mi;      
            
            if (x > Xc){
              cont = cont + 1;
              media += x;
            }      
    
        }
     
    double mediaFinal = (double) media/cont;
    System.out.print("Média: "+mediaFinal+ "\n");
    }
}

