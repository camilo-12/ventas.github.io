
/**
 * Write a description of class marcas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class marcas
{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        patos calsado = new patos();
        
        System.out.println("Bienvenido a la tienda Payless Shoes, siga los pasos : ");            
       
            System.out.println("Digite numero de  identificacion del cliente : ");            
            calsado.identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            calsado.nombre = sc.next();
            System.out.println("Digite el telefono del cliente: ");
            calsado.telefono = sc.next();
            System.out.println("Digite la cantidad de la marcaNike: ");
            calsado.marcaNike = sc.nextDouble();
            System.out.println("Digite la cantidad de la marcaAdiddas : ");
            calsado.marcaAdiddas = sc.nextDouble();
            System.out.println("Digite la cantidad  de la marcaPuma : ");
            calsado.marcaPuma = sc.nextDouble();
            
            calsado.totNike = (calsado.marcaNike * 230000);
            calsado.totAdiddas= (calsado.marcaAdiddas * 180000);
            calsado.totPuma = (calsado.marcaPuma * 250000 );
            calsado.TotalVenta = (calsado.totNike + calsado.totAdiddas + calsado.totPuma);
   
    System.out.println("Total de compra de la marca Nike es: " + calsado.totNike);
    System.out.println("Total de compra de la marca Adiddas es: " + calsado.totAdiddas);
    System.out.println("Total de compra de la marca Puma es: " + calsado.totPuma);
    System.out.println("El promedio total del lascompras es  : " + calsado.TotalVenta); 
}
}
