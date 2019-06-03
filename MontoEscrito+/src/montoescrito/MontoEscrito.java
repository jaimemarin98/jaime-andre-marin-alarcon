package montoescrito;
import java.util.Scanner;
/**
 *
 * @author jaimeandres
 */
public class MontoEscrito {

   
    public static String miles(float m)
    {
        String resultado=null;
        
        if((m/1000)>=1)
        {
            if((m/1000)<2&(m/1000)>=1)
            {
                resultado="mil "+centenas(m%1000);
            }
            else
            {
                if((m/1000)>1){                                    
                resultado=centenas(m/1000)+"mil "+centenas(m%1000);
            }
          } 
        }
        else
        {
            resultado=centenas(m);
        }
        
        
        
        
        return resultado;
    }
    
    public static String centenas(float m)
    {
        String resultado = null;
        
        if ((m/100)>=1)
        {
            switch ((int)(m/100))
            {
                case 1:
                    switch ((int)(m%100))
                    {
                        case 0: resultado="Cien ";break;
                        default: resultado="Ciento "+decenas(m%100);break;
                    }break;
                case 2:
                    switch ((int)(m%100))
                    {
                        case 0: resultado=unidades(m/100) + "Cientos ";break;
                        default: resultado=unidades(m/100)+ "Cientos " + decenas(m%100);
                    }break;
                case 3:
                    switch ((int)(m%100))
                    {
                        case 0: resultado=unidades(m/100) + "Cientos ";break;
                        default: resultado=unidades(m/100)+ "Cientos " + decenas(m%100);
                    }break;
                case 4:
                    switch ((int)(m%100))
                    {
                        case 0: resultado=unidades(m/100) + "Cientos ";break;
                        default: resultado=unidades(m/100)+ "Cientos " + decenas(m%100);
                    }break;
                case 5:
                    switch ((int)(m%100))
                    {
                        case 0: resultado="Quinientos ";break;
                        default: resultado="Quinientos " + decenas(m%100);
                    }break;
                case 6:
                    switch ((int)(m%100))
                    {
                        case 0: resultado=unidades(m/100) + "Cientos ";break;
                        default: resultado=unidades(m/100)+ "Cientos " + decenas(m%100);
                    }break;
                case 7:
                    switch ((int)(m%100))
                    {
                        case 0: resultado="Setesientos ";break;
                        default: resultado="Setesientos " + decenas(m%100);
                    }break;
                case 8:
                    switch ((int)(m%100))
                    {
                        case 0: resultado=unidades(m/100) + "Ciento s";break;
                        default: resultado=unidades(m/100)+ "Cientos " + decenas(m%100);
                    }break;
                case 9:
                    switch ((int)(m%100))
                    {
                        case 0: resultado="Novecientos ";break;
                        default: resultado= "Novecientos " + decenas(m%100);
                    }break;    
            }
        }
        else
        {
            resultado=decenas(m);
        }
       
            
        
        
        return resultado;
    }
    
    public static String decenas (float m)
    {
        String resultado = null;
        
        if((m/10)>=1)
        {
            switch ((int) (m/10))
            {
                    case 1: 
                       switch ((int)(m%10))
                
                       {
                            case 0: resultado="Diez ";break;
                            case 1: resultado="Once ";break;
                            case 2: resultado="Doce ";break;
                            case 3: resultado="Trece ";break;
                            case 4: resultado="Catorce ";break;
                            case 5: resultado="Quince ";break;
                            default: resultado="Diez y " + unidades(m%10);break;
                        }break;
                    case 2:
                        switch ((int) (m%10))
                        {
                            case 0: resultado="Veinte";break;
                            case 1: resultado="Veintiun ";break;
                            default: resultado="Veinti y " + unidades(m%10);break;
                        }break;
                    case 3:
                        switch ((int)(m%10))
                        {
                            case 0: resultado="Treinta";break;
                            default: resultado="Treinta y "+ unidades(m%10);break;
                        }break;
                    case 4:
                        switch ((int)(m%10))
                        {
                            case 0: resultado="Cuarenta";break;
                            default: resultado="Cuarenta y "+ unidades(m%10);break;
                        }break;
                    case 5:
                        switch ((int)(m%10))
                        {
                            case 0: resultado="Cincuenta";break;
                            default:resultado="Cincuenta y "+ unidades(m%10);break;
                        }break;
                    case 6:
                        switch ((int)(m%10))
                        {
                            case 0: resultado="Sesenta";break;
                            default: resultado="Sesenta y "+ unidades(m%10);break;
                        }break;
                    case 7:
                        switch ((int)(m%10))
                        {
                            case 0: resultado="Setenta";break;
                            default: resultado="Setenta y "+ unidades(m%10);break;
                        }break;
                    case 8:
                        switch ((int)(m%10))
                        {
                            case 0: resultado="Ochenta";break;
                            default: resultado="Ochenta y "+ unidades(m%10);break;
                        }break;
                    case 9:
                        switch ((int)(m%10))
                        {
                            case 0: resultado="Noventa";break;
                            default: resultado="Noventa y " + unidades(m%10);break;
                        }break;
                
            }
        }
        else
        {
            resultado=unidades(m);
        }
        
        return resultado;
    }
    
    public static String unidades(float m)
    {
         String resultado = null;
        
        
            switch ((int)(m))
            {
                case 0: resultado="";break;
                case 1: resultado="Uno "; break;
                case 2: resultado="Dos "; break;
                case 3: resultado="Tres "; break;
                case 4: resultado="Cuatro "; break;
                case 5: resultado="Cinco "; break;
                case 6: resultado="Seis "; break;
                case 7: resultado="Siente "; break;
                case 8: resultado="Ocho "; break;
                case 9: resultado="Nueve "; break;
                
            }
      
            return resultado;
        
    }
    
    
    
    
    public static String millon(float m)
    {
        String resultado=new String(); 
        
        if (m/1000000>1)
        {
            if ((m/1000000)>=1&(m/1000000)<2)
            {
                resultado="Un millon "+miles(m%1000000);
            }
            else
            {
                resultado= decenas(m/1000000)+"millones "+miles(m%1000000);
            }
        }
        else 
        {
         resultado = miles (m%1000000);   
        }
        
        return resultado;
        
        
        
              
        
}


    public static void main(String[] args) 
    {
        
        float m;
        String l;
        System.out.println("Digite el numero: ");
        Scanner in=new Scanner(System.in);
        m=in.nextFloat();
        l=millon(m);
        System.out.println(l);
        
    }
    
}


