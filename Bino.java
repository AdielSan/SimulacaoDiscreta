package industria;

import java.util.Random; 

public class Bino {
        public static void main(String[] args) {
        int NumExp=100000;
        int n=100, cg=0, cont = 0;
        double p=0.5;
        int k1=45, k2=60;
  
        for (int i=0; i<NumExp; i++){
            for (int j=1; j<=n;j++){
                if (Math.random(100) > p) cont++;  
            } 
            
            if(cont>=k1 && cont <= k2) cg++;
        }
     
    double prob = (double) cg/NumExp;
    System.out.print("Média: "+prob+ "\n");
    System.out.print("Média: "+cg + "\n");
    
    }
}

