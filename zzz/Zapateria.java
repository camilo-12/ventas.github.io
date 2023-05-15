
/**
 * Write a description of class Zapateria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Zapateria
{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        String[] identificaciones = new String[50];
        String[] nombres = new String[50];
        String[] telefonos = new String[50];
        double[] Nike = new double[50];
        double[] Adiddas =  new double[50];
        double[] Puma =  new double[50];
        
        int numeroVentas;
        String identificacion, nombre, telefono;
        double marcaNike, marcaAdiddas, marcaPuma;
        double promedio = 0;
        System.out.println("Digite la cantidad de zapatos: ");
        numeroVentas =  sc.nextInt();
        for(int i = 0; i < numeroVentas; i++ ){
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
            
            
            double totNike =  marcaNike * 230000;
            double totAdiddas =  marcaAdiddas * 180000;
            double totPuma =  marcaPuma * 250000;
            double PromedioVentas = totNike+totAdiddas+totPuma;
        } 
            
    }
   
}
