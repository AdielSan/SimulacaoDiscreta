
package calmedia;


public class CalMedia {

    public static void main(String[] args) {
       int NEXP = 10000, cont=0;
       double med = 0;
       
       for (int i=0;i<NEXP;i++){
           double r = Math.random();
           double x = Math.pow(r, 0.25);
           
           med+=x;
       }
    med = med/NEXP;
    System.out.println("média"+med); 
    }
}
