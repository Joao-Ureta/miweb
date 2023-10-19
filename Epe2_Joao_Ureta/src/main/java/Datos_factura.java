/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joao
 */
public class Datos_factura {
    
    public String Nombre_cliente;
    public String Apellidos_cliente;
    public String Edad_cliente;
    public String Rut_cliente;
    public String Nombre_empresa;
    public String Rut_empresa;
    public String Giro_empresa;
    
public void Datos_factura (){
    
}

public void guardaFactura (String nom, String apes, String edad, String rut, String empresa, String rut_emp, String giro){
    
    this.Nombre_cliente = nom;
    this.Apellidos_cliente = apes;
    this.Edad_cliente = edad;
    this.Rut_cliente = rut;
    this.Nombre_empresa = empresa;
    this.Rut_empresa = rut_emp;
    this.Giro_empresa = giro;
    
    //array
String[] entidad = {this.Nombre_cliente, this.Apellidos_cliente, this.Edad_cliente, this.Rut_cliente, this.Nombre_empresa, this.Rut_empresa, this.Giro_empresa};

    
    for(int i=0; i<entidad.length; i++){
        
        System.out.println("Los datos ingresados son: " +entidad[i]);
        
    }

    return;
} 
    
}


