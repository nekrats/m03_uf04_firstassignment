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
public abstract class BarcoDeMercancias extends Barco {

    private int cargamento;

    public BarcoDeMercancias(int cargamento, Motor motor, double eslora, double manga, int nudos, int peso) {
        // llama al constructor de la superclase
        super(motor, eslora, manga, nudos, peso);
        this.cargamento = cargamento;
        
    }

    @Override
    public void arranca() {
        // ...
        System.out.println("Arrancando barco de mercancias...");
    }
    
    @Override
    public void atraca() {
        // ...
        System.out.println("Atracando barco de mercancias");
    }

    @Override
    public void abandonenElBarco() {
        System.out.println("Abandonan el barco ordenadamente");
    }

    @Override
    public void comportamiento() {
        System.out.println("Transporta la carga.");
    }
    
    
    
}
