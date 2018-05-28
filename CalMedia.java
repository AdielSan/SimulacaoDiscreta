
package calmedia;


public class CalMedia {

    public static void main(String[] args) {
       int NEXP = 10000, cont=0;
       double med = 0, medy = 0;
       
       for (int i=0;i<NEXP;i++){
           double r = Math.random();
           double x = Math.pow(r, 0.25);
           double y = 1/(x+1);
           
           medy+=y;
           med+=x;
       }
    med = med/NEXP;
    medy = medy/NEXP;
    
    System.out.println("E[x]"+med+"\n");
    System.out.println("E[y]"+medy);
    }
}
