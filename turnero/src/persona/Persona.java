
package persona;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jaimeandres
 */
public class Persona{

   

    
    
     public int ID, Telefono;
     public String nombre;
      
    public void Personas (int i, int tel, String nom){     
         this.ID=i;
         this.Telefono=tel;
         this.nombre=nom;
         Scanner tem=new Scanner(System.in);       
        System.out.println("Ingrese ID: ");
        ID=tem.nextInt();
        System.out.println("Ingrese el nombre: ");
        nom=tem.nextLine();
        System.out.println("Ingrese el telefono: ");
        tel=tem.nextInt();
         
     }
     public void Datos(){
         
         System.out.println("ID: " +ID);
         System.out.println("Nombre: " +nombre);
         System.out.println("Telefono: " +Telefono);
         
     }
     
     public int getID(){        
     return this.ID;    
     }
     public void setID(){
      this.ID= ID;
     } 
     public String getnombre(){
     return this.nombre;       
     }
     public void setnombre(){
       this.nombre=nombre;
     }
     
     public int getTelefono(){
     return this.Telefono;
     }
     public void setTelefono(){
       this.Telefono=Telefono;
     }
    
}   
        
    

    

        

  