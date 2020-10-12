/*
 * La clase CuentaCorriente representa una cuenta corriente bancaria.
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class CuentaCorriente {

    // Propiedades
    private String titular;
    private double saldo;
    
    
    // Constructor
    public CuentaCorriente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        
    }
    
    // Getters/Setters

    public double getSaldo() {
        return saldo;
    }
    
    
    // Métodos heredados
    @Override    
    public String toString() {
        return "CuentaCorriente{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }

    // Métodos adicionales
    
    /* El método ingresa acumula ingreso en saldo */
    public void ingresa(double ingreso) {
    }
    
    /* El método abona resta abono de saldo */ 
    public void abona(double abono) {
        
    }
}
