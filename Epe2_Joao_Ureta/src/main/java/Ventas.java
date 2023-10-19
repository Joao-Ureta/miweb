/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joao
 */
public class Ventas extends Datos_factura {
    
    public int Cant_facturas;
    public int Recaudacion_ventas_dia;
    public int Recaudacion_mensual;
    public double Total_iva;
    public double Desc_iva;
    public double utilidades;
    

public void ingresos(int g1, int g2){
    
    //cambio de variable
    this.Recaudacion_ventas_dia = g1;
    this.Cant_facturas = g2;
    
        
       
        Recaudacion_mensual = Cant_facturas*Recaudacion_ventas_dia;
        Total_iva= 0.19;
        Desc_iva = Recaudacion_mensual * Total_iva;
        utilidades = Desc_iva +Recaudacion_mensual;
        System.out.println("El total de utilidades es: " +utilidades);
    }
    

    
}

