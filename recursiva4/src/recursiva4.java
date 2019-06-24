/*
 Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 
 */
import javax.swing.JOptionPane;
public class recursiva4 {
    public static void main(String[] args){
        double soma,n,cont=1;
        
        n=Double.parseDouble(JOptionPane.showInputDialog("Insira um valor desejado "));
        soma=recursiva4( n, cont);
        System.out.println(soma);
        
    }
    public static double recursiva4( double n,double cont){
       
        if(n==1){
            return 1;
        }
        else{
            
            return (n/(cont))+ recursiva4(n-1,cont+1);
            
        }
    }
}
