/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;





public class Carguero extends BarcoDeMercancias {
    
    private int contenedores;

    public Carguero(int contenedores, int cargamento, Motor motor, double eslora, double manga, int nudos, int peso){
        super(cargamento,motor, eslora, manga, nudos, peso);
        this.contenedores = contenedores;
    }
}
