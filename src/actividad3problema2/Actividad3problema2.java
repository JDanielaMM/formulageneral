/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3problema2;
import java.util.Scanner;

/**
 *
 * @author danii
 */
public class Actividad3problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        double a,b,c,b2,x1, x2, raiz,r;
        System.out.println("Fórmula general");
        System.out.println("Ingresa el valor de a: ");
        a= key.nextDouble();
        System.out.println("Ingresa el valor de b: ");
        b= key.nextDouble();
        System.out.println("Ingresa el valor de c: ");
        c= key.nextDouble();
        
        b2= Math.pow(b, 2);//Math.pow para obtener el cuadrado de b
        raiz= (b2)-(4*a*c);
        
        if (raiz<=0)//Si el valor es negativo, no se puede sacar la raiz
        {
            x1= (-b/(2*a));
         System.out.println("El valor de x1 es: "+x1);
        System.out.println("El valor de x2 es: "+x1);
        }
        
        if (raiz>0)//Si el valor es positivo se puede sacar raiz
        {
            r= Math.sqrt(raiz);//Math.sqrt para obtener la raiz
        x1= (-b+ r)/(2*a);
        x2= (-b- r)/(2*a);
         System.out.println("El valor de x1 es: "+x1);
        System.out.println("El valor de x2 es: "+x2);
        }
    
    }
    
}
