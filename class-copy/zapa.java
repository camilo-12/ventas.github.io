
/**
 * Write a description of class zapa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class zapa
{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        String identificacion, nombre, telefono;
        double marcaNike, marcaAdiddas, marcaPuma,totNike,totAdiddas,totPuma,TotalVenta;
        double promedio = 0;
        
        System.out.println("Bienvenido a la tienda Payless Shoes, siga los pasos : ");            
       
            System.out.println(" Digite la identificacion del cliente : ");            
            identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite el telefono del cliente: ");
            telefono = sc.next();
            System.out.println("Digite la cantidad de la marcaNike: ");
            marcaNike = sc.nextDouble();
            System.out.println("Digite la cantidad de la marcaAdiddas : ");
            marcaAdiddas = sc.nextDouble();
            System.out.println("Digite la cantidad  de la marcaPuma : ");
            marcaPuma = sc.nextDouble();
            
            totNike = (marcaNike * 230000);
            totAdiddas= (marcaAdiddas * 180000);
            totPuma = (marcaPuma * 250000 );
            TotalVenta = (totNike + totAdiddas + totPuma);
   
    System.out.println("Total de compra de la marca Nike es: " + totNike);
    System.out.println("Total de compra de la marca Adiddas es: " + totAdiddas);
    System.out.println("Total de compra de la marca Puma es: " + totPuma);
    System.out.println("El promedio totla de  compras es  : " + TotalVenta);   
}
}