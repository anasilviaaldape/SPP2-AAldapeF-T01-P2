/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aaldapef.t01.p2;
import java.util.Scanner;
/**
 *
 * @author Aldape
 */
public class SPP2AAldapeFT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ana Silvia Aldape Felizardo
        //A01410367
        //IIS
        
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        //Variales
        double base;
        double altu;
        double per;
        double sup;
        
        //Instrucciones
        System.out.println("PROGRAMA 02.");
        System.out.println(" ");
        System.out.println("Ingresa los siguientes datos");
        System.out.print("Base del rectangulo: ");
        base= teclado.nextDouble();
        System.out.print("Altura del rectangulo: ");
        altu= teclado.nextDouble();
        
        System.out.println(" ");
        per= 2*base + 2*altu;
        System.out.println("Perimetro del rectangulo= " +per);
        sup= base*altu;
        System.out.println("Superficie del rectangulo= " +sup);
        
        
    }
    
}
