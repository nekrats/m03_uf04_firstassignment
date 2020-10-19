/*
 * FIRST ASSIGNMENT
 */
package cat.copernic.review;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pep
 */
public class M03_UF04_FirstAssignment {

    /**
     * @param args the command line arguments
     * 
     * Crea una nueva subclase de Barco llamada BarcoDeMercancias 
     * 
     * Crea una nueva subclase o más de BarcoDeMercancias llamada Carguero
     * 
     * 
     */
    public static void main(String[] args) {
        // Prueba to código aquí
        
        Barco barco1 = new Yate(true, 4, 6, new Motor(1000), 20.0, 12.5, 23, 7);
        barco1.arranca();
        
        Barco barco2 = new PortaAviones(35, new Motor(6000), 250, 75, 46, 60_000, 35);
        barco2.arranca();
        
        Barco barco3 = new BuqueFrigorifico("carne", 30, new Motor(5000), 120, 80, 50, 90);
        barco3.arranca();

        Barco barco4 = new Carguero(200, 500, new Motor(10000),150,80,60,50);
        barco4.arranca();

        Barco barco5 = new BuquePetrolero(159, 200, new Motor(8000), 200, 80, 90, 40);
        barco5.arranca();
        
        System.out.println(barco1 instanceof PortaAviones);
        
        
//        CuentaCorriente cc1 = new CuentaCorriente("Pedro", 1_000.0);
//        System.out.println(cc1);
//        try {
//            cc1.ingresa(123.09);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(cc1);
//        try {
//            cc1.abona(98.87);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(cc1);
//
//        Cuadrado c1 = null;
//        try {
//            c1 = new Cuadrado(9);
//            System.out.println(c1.area());
//            System.out.println(c1.perimetro());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

    }

}
