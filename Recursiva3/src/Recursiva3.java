/*
 3)   Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 
 */
import javax.swing.JOptionPane;
public class Recursiva3 {
    public static void main(String[]args){
        double soma,n;
        
        n=Double.parseDouble(JOptionPane.showInputDialog("Insira um número desejado"));
        soma= recursiva3(n);
        System.out.println(soma);
    }
    public static double recursiva3(double n){
        if(n==1){
            return 1;
        }
        else{
            return  1/n+ (recursiva3(n-1));
        }
    }
    
}
