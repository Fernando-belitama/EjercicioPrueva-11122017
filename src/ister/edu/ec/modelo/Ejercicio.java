
package ister.edu.ec.modelo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author FERNANDO
 */
public class Ejercicio {
    private Integer arrayTemperaturas[]; 
     public  void llenarArreglos(){
        arrayTemperaturas=new Integer[10];
        for (int i = 0; i < arrayTemperaturas.length; i++) {
            arrayTemperaturas[i]=(int)(Math.random()*10); 
         }
     }
     public  void imprimir(){
         String acu="";
         for (int i = 0; i < arrayTemperaturas.length; i++) {
             acu +=" "+arrayTemperaturas[i];
            }
         JOptionPane.showMessageDialog(null, acu);
     }
    public void imprimirFacil(){       
        JOptionPane.showMessageDialog(null,Arrays.toString(arrayTemperaturas));
    }
    public  void ordenar(){
        Arrays.sort(arrayTemperaturas);
    }
    public  void maximo(){
        List<Integer> arr = new ArrayList();
        arr=Arrays.asList(arrayTemperaturas);
        Integer max= Collections.max(arr);
        JOptionPane.showMessageDialog(null,max);
        }
    public  void menu(){
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(""
            + "\n\t  ********** MENU **********\n\n"
            +"1.- llenarArreglos\n"
            +"2.- imprimir\n"
            +"3.- imprimirFacil\n"
            +"4.- ordenar\n"
            +"5.- maximo\n"
            +"6.- salir\n"));
            switch(op){
                case 1:
                    llenarArreglos();
                    break;
                case 2:
                    imprimir();
                    break;
                case 3:
                    imprimirFacil();
                    break;
                case 4:
                    ordenar();
                    break;
                case 5:
                    maximo();
                    break;
            }       
        }while(op!=6);
    }   
}
