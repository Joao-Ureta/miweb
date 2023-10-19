

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joao
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        
       Scanner scanNom = new Scanner(System.in);
        Scanner scanApes = new Scanner(System.in);
        Scanner scanEdad = new Scanner(System.in);
        Scanner scanRut = new Scanner(System.in);
        Scanner scanEmpresa = new Scanner(System.in);
        Scanner scanRut_emp = new Scanner(System.in);
        Scanner scanGiro = new Scanner(System.in);
        
        //Scanner clase Datos_factura
        Scanner scanCant_fact = new Scanner(System.in);
        Scanner scanVent_dia = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del cliente: ");
        String nom = scanNom.nextLine();
        
        System.out.println("Ingrese los apellidos del cliente: ");
        String apes = scanApes.nextLine();
        
        System.out.println("Ingrese la edad del cliente: ");
        String edad = scanEdad.nextLine();
        
        System.out.println("Ingrese el rut del cliente: ");
        String rut = scanRut.nextLine();
        
        System.out.println("Ingrese el nombre de la empresa: ");
        String empresa = scanEmpresa.nextLine();
        
        System.out.println("Ingrese el rut de la empresa: ");
        String rut_emp = scanRut_emp.nextLine();
        
        System.out.println("Ingrese el giro de la empresa: ");
        String giro = scanGiro.nextLine();
        
        Datos_factura factura = new Datos_factura();
        factura.guardaFactura(nom, apes, edad, rut, empresa, rut_emp, giro);
        
        System.out.println("Ingrese la cantidad de facturas emitidas: ");
        int Cant_facturas = scanCant_fact.nextInt();
        
        System.out.println("Ingrese el total de las ventas del dia: ");
        int Recaudacion_ventas_dia = scanVent_dia.nextInt();
        
        Ventas ventas = new Ventas();
        ventas.ingresos(Cant_facturas, Cant_facturas);
        ventas.guardaFactura(nom, apes, edad, rut, empresa, rut_emp, giro);
        
        
    }        
    
}
