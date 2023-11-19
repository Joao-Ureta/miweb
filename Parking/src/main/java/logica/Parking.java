/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logica;

import gui.DatosCentralParcking;
import gui.IngresoParcking;
import gui.Principal;

/**
 *
 * @author Joao
 */
public class Parking {

    public static void main(String[] args) {
        
        Principal prin = new Principal();
        prin.setVisible(true);
        prin.setLocationRelativeTo(null);
        
        DatosCentralParcking datosparking = new DatosCentralParcking();
        datosparking.setLocationRelativeTo(null);
        
        IngresoParcking ingreso = new IngresoParcking();
        ingreso.setLocationRelativeTo(null);
        
        
        
    }
}
