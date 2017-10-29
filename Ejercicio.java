/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosif;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Ejercicio {
    
/**
 * Se ingresa una edad y se informa si es mayor de edad
 */
public static void Numero13()
{
        String dato;
        Integer edad;
        Scanner misc= new Scanner(System.in);
        System.out.println("Ingrese su edad : ");
        dato= misc.next();
        edad= Integer.parseInt(dato);
        
        if ( edad > 17 ) {
            System.out.println("Usted es mayor");}
        else {
            System.out.println("Usted es menor");}



}
    

/**
 * Se pide ingresar una clave, si es "utn750" se mostrara el mensaje bienvenido,
     * de lo contrario el mensaje "clave erronea"
 */
public static void Numero14()
{
    String clave;
        Scanner misc= new Scanner(System.in);
        
        System.out.println("Ingresar clave: ");
        clave= misc.next();
        
        //boolean respuesta;
        //respuesta = clave.equals(utn750);
        
        
        if (clave.equals("utn750"))
        {System.out.println("Bienvenido");
        }
        else 
        {System.out.println("Clave erronea");}
        
        
        
        



}
   



/**
 * Se ingresa un importe. si supera los 100$ se le suma un 23% si es menor a 100$ 
     * se le descuenta el 50%
 */
public static void Numero15()
{
        Scanner misc= new Scanner(System.in);
        String datoAux;
        Double importe;
        
        System.out.println("Ingrese el importe: ");
        datoAux= misc.next();
        importe= Double.parseDouble(datoAux);
        
        if (importe>100) {
        
        System.out.println( "El importe es: "+ (importe * 1.23));
        }
        else 
        {
        System.out.println("El importe es : " +  (importe * 0.50));


        }}
   



/**
 * Se ingresa el importe de un pasaje de avion y el mes de viaje,
 * si es enero se le descuenta un 10%
     * por temporada baja 
 */
public static void Numero16()
{
    Scanner misc= new Scanner(System.in); 
        String datoAux;
        String mes;
        Double importe;
        
        System.out.println("Ingrese el importe del pasaje de avion: ");
        datoAux= misc.next();
        importe= Double.parseDouble(datoAux);
        
        System.out.println("Mes de viaje?: ");
        mes= misc.next();
        
        if (mes.equals("enero"))
           { 
            System.out.println("Su pasaje cuesta: "+ (importe * 0.90));}
        
        else 
          {  System.out.println("Su pasaje cuesta: " + importe);}



}
   



/**
 * Se pide una edad y se informa si es niño adolescente o mayor de edad
 */
public static void Numero17()
{
     Scanner misc= new Scanner(System.in);
        Integer edad;
        //
        System.out.println("Ingrese edad: ");
        edad= misc.nextInt();
        
       if (edad>18)
       {System.out.println("Es mayor de edad");}
       
       if (edad <=12)
       {System.out.println("Es niño");}
        
       if ((12 < edad ) && ( edad<18 ))
               
       {System.out.println("Usted es adolescente");}
       
       /** Forma optima(mejor programado)
        * if (edad>18)
       {System.out.println("Es mayor de edad");}
       
       if (edad <12)
       {System.out.println("Es niño");}
       * 
       else
       {System.out.println("Usted es adolescente");}
        * 
        */



}
   




/**

 *Se pide una clave  y si coincide de muestra el mensaje “Bienvenido”  de 
 * lo contrario mostrar el mensaje “clave incorrecta.
 */
public static void Numero18()
{



}
   




/**
 * se ingresa un importe, si supera los 100 pesos se  le suma un impuesto 
 * del 23%, si no se les descuenta el 50%
 */
public static void Numero19()
{



}
   





/**
 * Se ingresa un importe del pasaje de avión y el mes de viaje, si el mes es 
 * enero, se les descuenta un 10% por temporada baja
 */
public static void Numero20()
{



}
   



/**
 *  se ingresa una nota, si es 10 mostrar excelente, si esta entre 9 y 4 
 * mostrar aprobó , de lo contrario mostrar “ la próxima será” .
 */
public static void Numero22()
{
        String datoAux;
        Double nota;
        
        Scanner misc= new Scanner(System.in);
        
        System.out.println("Ingrese nota: ");
        datoAux= misc.next();
        nota= Double.parseDouble(datoAux);
        
        if( 10 ==nota)
        {System.out.println("Exelente");}
        
        if ((nota<= 9) && ( nota >= 4))
        System.out.println("Aprobó");
        
        if (nota<4)
        {System.out.println("desaprobó");}


}
   


   
/**
 * Ferretería Ferrete
Debemos hacer una serie de aplicaciones para este negocio
* 
* 23- Debemos pedir el ancho y el largo de un terreno e informar cuantos metros
* de alambre necesitamos para dar tres (3) vueltas de alambre.
24- Debemos pedir el ancho, el largo de un terreno y la cantidad de hilos 
* de alambre e informar cuantos metros de alambre necesitamos para completar
* las vueltas de alambre.
25-Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared de 
* 1 metro cuadrado, se pide el alto y ancho y se informa la cantidad de cada
* material que necesito.
26- de pide una temperatura y se pide si se quiere pasar Celsius o Fahrenheit,
* hacer la cuenta y mostrar el resultado.
27- para una pileta se necesita saber la superficie, se debe pedir que tipo de
* pileta tiene (cuadrada o redonda) de ser redonda, pedir el radio y si es 
* cuadrada pedir el largo y el ancho, mostrar la superficie de la pileta.
*/
public static void Numero23()
{
       String datoAux;
       Double ancho;
       Double largo;
       Double total;
       
       Scanner Misc= new Scanner(System.in);
       
        System.out.println("Indique el ancho del terreno: ");
        datoAux= Misc.next();
        ancho= Double.parseDouble(datoAux);
        
        System.out.println("Indique el largo del terreno: ");
        datoAux= Misc.next();
        largo= Double.parseDouble(datoAux);
        
        total= (ancho*largo)* 3;
        
        System.out.println("Los metros necesarios para dar 3 vueltas de alambre"
                + " son: "+total +" metros");
    
    
}




public static void Numero24()
{
   String datoAux;
       Double ancho;
       Double largo;
       Double hilos;
       Double total;
       
       Scanner Misc= new Scanner(System.in);
       
        System.out.println("Indique el ancho del terreno: ");
        datoAux= Misc.next();
        ancho= Double.parseDouble(datoAux);
        
        System.out.println("Indique el largo del terreno: ");
        datoAux= Misc.next();
        largo= Double.parseDouble(datoAux);
        
        System.out.println("Indique la cantidad de alambre : ");
        datoAux= Misc.next();
        hilos= Double.parseDouble(datoAux);
        
        total= (((ancho*largo)*3)- hilos);
        
        System.out.println("Para completar las vueltas de alambre se necesita : "+total); 
    
    
}




public static void Numero25()
{
   String datoAux;
       Double ancho;
       Double alto;
       Double total;
       Double totalCal;
       Double totalCemento;
       
       Scanner Misc= new Scanner(System.in);
      
        System.out.println("Indique el ancho: ");
        datoAux= Misc.next();
        ancho= Double.parseDouble(datoAux);
        
        System.out.println("Indique el alto :");
        datoAux= Misc.next();
        alto= Double.parseDouble(datoAux);
        
        total= (ancho*alto);
        totalCal= (total*2);
        totalCemento= (total*3) ;
        
        System.out.println("La cantidad total que se necesita son "+totalCal+""
                + " de cal y "+totalCemento+" de cemento."); 
    
    
}





public static void Numero26()
{
    String datoAux;
        String respuesta;
        Double temperatura;
        
        Scanner Misc= new Scanner(System.in);
        
        System.out.println("Indique temperatura: ");
        datoAux= Misc.next();
        temperatura= Double.parseDouble(datoAux);
        
        System.out.println("¿Quiere ver la temperatura en grados Fahrenheit?" );
        respuesta= Misc.next();
        
        if (respuesta.equals("si"))
            
        { temperatura= ((temperatura*1.8)+32);
            System.out.println("La temperatura es "+temperatura+" grados Farenheint.");}
        
        
        else{ System.out.println("La temperatura es "+temperatura+" grados Celsius." );}
    
    
    
}




public static void Numero27()
{
    String datoAux;
        String tipo;
        Double radio;
        Double largo;
        Double ancho;
        Double resultadoCuadrada;
        
        Scanner Misc= new Scanner(System.in);
        
        System.out.println("Qué tipo de pileta tiene?");
        tipo= Misc.next();
        
        if (tipo.equals("redonda"))
        {System.out.println("Indique el radio: ");
        datoAux= Misc.next();
        radio= Double.parseDouble(datoAux);
        
        radio= 3.14*(radio*radio);
        
        System.out.println("la superficie de la pileta es : "+radio);}
        
        if (tipo.equals("cuadrada"))
                
        {System.out.println("Indique el largo: ");
        datoAux= Misc.next();
        largo= Double.parseDouble(datoAux); 
        
        System.out.println("Indique el ancho: ");
        datoAux= Misc.next();
        ancho= Double.parseDouble(datoAux); 
        
        resultadoCuadrada= (largo*ancho);
        
        System.out.println("La superficie es de la pileta es : "+resultadoCuadrada);}
    
    
}




}



















    
    

