/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema6;
import java.util.*;
/**
 *
 * @author Enano
 */
public class PP2Problema6 {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double hr, sal;
        double[]inf;
        // Resolucion
        inf=getInf(); //Se recibe un arreglo que contenga el ingreso y el pago
        hr=inf[0];    //Se igualan a las variables, para que el metodo que las procesa sea más general.
        sal=inf[1];
        imprimir(calcular(hr,sal));
    }
    public static double[] getInf () //Se recibe la información
    {
        double [] inf = {1,2};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas:"); //Utilizo un arreglo para poder regresar 2 valores al mismo tiempo.
        inf[0]=entrada.nextDouble();
        System.out.println("Ingrese la paga por hora:");
        inf[1]=entrada.nextDouble();
        return inf;
    }
    public static double calcular (double h, double s)
    {
        double BHours, ExtHours2,ExtHours3,TotSal=0; //Pago Total, Pago de Horas Normales, Extra por 2 y Extra por 3.
        if(h>40)
        {
            BHours = s*40;  
            TotSal=TotSal+BHours;  
            if(h>48)
            {
                h=h-48;          //Se restan 48, porque trabajo por lo menos 49
                ExtHours3=h*(s*3);
                ExtHours2=s*8*2;  //Como se sabe que por lo menos son 49 horas, se toman por sentado que trabajo las 8 extras.
                TotSal=TotSal+ExtHours3+ExtHours2;
            }
            else
            {
                ExtHours2 = s*(h-40)*2;
                TotSal=TotSal+ExtHours2;
            }
        }
        else
        {
            TotSal=s*h; //Si se trabajan menos de 40 horas, se va directamente a sacar la paga.
        }
        return (TotSal);
    }
    public static void imprimir (double a)
    {
        System.out.println("El saldo del trabajador/a es: $ "+a+" pesos");
    }
}

