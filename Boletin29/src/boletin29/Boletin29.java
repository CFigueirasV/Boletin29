package boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Boletin29 {


    public static void main(String[] args) {
       
        String opcion;
        ArrayList<Barco> alquiler = new ArrayList<>();
        do{
           opcion = JOptionPane.showInputDialog("Menú\n1. Añadir barco\n2. Visualizar lista de barcos\n3. Salir");
           switch(opcion){
               case "1": String[] barcos = {"Velero","Embarcación deportiva","Yate"};
                   int opcion2 = JOptionPane.showOptionDialog (null, " Quieres bailar esta noche?", "Cita", 
                           JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, barcos, barcos[0]);
                   switch(opcion2){
                       case 0: break;
                       case 1: break;
                       case 2: break;
                   }
                   break;
               case "2": 
                   for(int i=0;i<alquiler.size();i++){
                       System.out.println(alquiler.get(i).toString());
                   }
                   break;
               case "3": System.exit(0);
               default: break;
           }
        }while(opcion!="3");
}
        
        
}