
package masa;

import java.util.Scanner;

public class Masa {
  public static void main(String[] args) {
  Scanner teclado = new Scanner (System.in);
  int a,b; 
  float c, res, imc; 
   System.out.println ("si eres adulto selecciona '1'"); 
   System.out.println ("si eres niño pulsa '2'"); 
   System.out.println ( "si eres mototaxi impulsada con motor 5000 pulsa '3'");  
  a = teclado.nextInt();
  if (a==1)
  {System.out.println ("digite su peso");
    b = teclado.nextInt();
    System.out.println ("ingrese su altura"); 
    c = teclado.nextFloat();
    res = c*c ; 
    imc = b/ res; 
    
   System.out.println ( " su imc es:  " + imc );
   if (imc<= 18.5) {System.out.print ("usted esta bajo de peso, deberia de consultar a un nutriólogo");
   }
   else if (imc>= 18.6 && imc <= 24.9)
   {System.out.print ("usted esta en su peso, pero no descuide sus comidas");}
   else if ( imc >= 25.0 && imc<=29.9)
   {System.out.print ("usted esta en sobrepeso,cuidese mucho");}
   else if (imc >= 30.0) 
   {System.out.print ("mi estimado, lamento decirle que esta en obesidad");}
   }
   else if (a==2) {System.out.print (" aun no sabemos como calcular tu imc , vuelve pronto");}
   else if (a==3) {System.out.print ("sal de mi programa");}
   else if (a<=4) {System.out.print ("no hay funcion, por favor , selecione los algun numero  indicado");}
  } 
}