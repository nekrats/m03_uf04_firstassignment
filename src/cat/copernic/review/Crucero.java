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
public class Crucero extends BarcoDePasajeros {
    
    // 0..100
    private double lujo;

    public Crucero(double lujo, int camarotes, int pasajeros, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(camarotes, pasajeros, motor, eslora, manga, nudos, peso);
        this.lujo = lujo;
    }
    
    
    
}
