
package boletin74;

import javax.swing.JOptionPane;

/**
 *
 * @author miglezlor
 */
public class Peso {
    
    public int pedirPeso(){
        
        int peso;
        String res= JOptionPane.showInputDialog("Introduce o peso");
        peso=Integer.parseInt(res);
        return peso;
    }
    public String pedirNome(){
        String nome=JOptionPane.showInputDialog("Introduce o nome");
        return nome;
    }
    public void compararPesos (int peso1, String nome1, int peso2, String nome2 ){
        if (peso1>peso2)
            System.out.println(nome1+" pesa máis e a diferencia de peso é "+(peso1-peso2));
        else
            System.out.println(nome2+" pesa máis e a diferencia de peso é "+(peso2-peso1));
    }
    
}
