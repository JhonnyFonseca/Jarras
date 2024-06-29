package interfaz;

import gfutria.SearchStateSpaces;
import java.util.ArrayList;
import mundo.Jarras;

public class InterfazApp 
{
    public static void main(String[] args) 
    { Jarras jarras;
        
//      System.out.println("Hay 2 galones, un galon de 6 litros y el otro de 8 litros sin mediciones");
//      System.out.println("¿Como se llenaria el de 8 litros hasta la mitad usando solo los 2 baldes?");
      SearchStateSpaces Busqueda;
      ArrayList lst;
      jarras = new Jarras(0 , 0);
      Busqueda = new SearchStateSpaces("0 , 4", jarras, 8);
      lst = Busqueda.solve();
      int i = 0;
      
      System.out.println("Numero de pasos: "+lst.size());
      if (lst.size() > 0){
          while(i < lst.size()){
              System.out.println(lst.get(i));
              i++;
          }
      }
//      view(jarras);
//      
//     jarras.llenar6(); view(jarras);
//     jarras.vaciar6en8(); view(jarras);
//     jarras.llenar6(); view(jarras);
//     jarras.vaciar6en8(); view(jarras);
//     jarras.descargar8(); view(jarras);
//     jarras.llenar8con6(); view(jarras);
    }
    
//    public static void view(Jarras jarras)
//    {   
//        System.out.println(jarras.getJarra6() + " " + jarras.getJarra8());        
//    }        
}
