/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;





public class BuquePetrolero extends BarcoDeMercancias {
    
    private int barriles_petro;

    public BuquePetrolero(int barriles_petro, int cargamento, Motor motor, double eslora, double manga, int nudos, int peso){
        super(cargamento,motor, eslora, manga, nudos, peso);
        this.barriles_petro = barriles_petro;
    }
}
