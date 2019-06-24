/*
5)   Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
 */
import javax.swing.JOptionPane;
public class recursiva5 {
    public static void main(String [] args){
        double n, soma, fat;
        n=Double.parseDouble(JOptionPane.showInputDialog("Insira um número desejado:"));
        soma=recursiva5(n);
        System.out.println(soma);
        
    }
    public static double recursiva5(double n){
        if(n==1){
            return 1;
        }
        else{
            return recursiva5(n-1)+ Ffatorial(n);
        }
    }
    public static double Ffatorial(double n){
        double fat=1;
        for(int i=0;i<n;i++){
            fat= fat*i;
            
        }
        return fat;
    }
}
