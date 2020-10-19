/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;





public class BuqueFrigorifico extends BarcoDeMercancias {
    
    private String alimentos;

    public BuqueFrigorifico(String alimentos, int cargamento, Motor motor, double eslora, double manga, int nudos, int peso){
        super(cargamento,motor, eslora, manga, nudos, peso);
        this.alimentos = alimentos;
    }
}
