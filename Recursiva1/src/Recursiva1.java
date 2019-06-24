/*
Recursiva 1)   Serie1 = (1+2+3+...+100)
 */
import javax.swing.JOptionPane;
public class Recursiva1 {
    public static void main(String [] args){
    int serie,n=100;
    serie= Recursiva1( n);
    System.out.print (serie);
    }
    static public int Recursiva1(int n){
        if (n==1){
            return 1;
        }
        else{
            return n + Recursiva1(n-1);
        }
        
    }
}
   
  