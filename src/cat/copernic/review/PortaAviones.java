/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class PortaAviones extends BarcoDeGuerra {

    private int aviones;

    public PortaAviones(int aviones, Motor motor, double eslora, double manga, int nudos, int peso, int cañones) {
        super(motor, eslora, manga, nudos, peso, cañones);
        this.aviones = aviones;
    }

    public void arranca() {
        // ...
        System.out.println("Arrancando barco de guerra de tipo portaaviones ...");
    }

    public void atraca() {
        // ...
        System.out.println("Atracando barco de guerra de tipo portaaviones...");
    }

}
