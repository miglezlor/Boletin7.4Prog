
package boletin74;

/**
 *
 * @author miglezlor
 */
public class Boletin74 {


    public static void main(String[] args) {

        int peso1, peso2;
        String nome1, nome2;
        
        Peso obx=new Peso();
        nome1=obx.pedirNome();
        peso1=obx.pedirPeso();
        nome2=obx.pedirNome();
        peso2=obx.pedirPeso();
        
        obx.compararPesos(peso1, nome1, peso2, nome2);
    
    }
}
