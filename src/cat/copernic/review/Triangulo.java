/*
 * Acaba la clase Triangulo con el/los constructores, accesores (get/set)
 * método toString().
 * fecha limite: 15/10/2010 19:00
 */
package cat.copernic.review;

/**
 *
 * @author pep
 */
public class Triangulo {

    // propiedades
    private double base;
    private double altura;

    // Polimorfismo
    public Triangulo(double base, double altura) throws Exception {
        if (base <= 0 || altura <= 0) {
            throw new ParametroNoPositivoException("La base y la altura tienen que ser positivos. base: " + base + " altura: " + altura);
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws Exception {
        if (base <= 0 ) {
            throw new ParametroNoPositivoException("La base tiene que ser positiva. base: " + base);
        }
            
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws Exception {
        if (altura <= 0 ) {
            throw new ParametroNoPositivoException("La altura tiene que ser positiva. altura: " + altura);
        }
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    /* Calcula el área de este triangulo */
    public double area() {
        return base * altura / 2;
    }

    /* Calcula el perímetro de este triangulo conocida su base y altura */
    public double perimetro() {
        // Math.sqrt(345.9);
        // Math.pow(n, 2.0);
        return calcHipotenusa() * 2 + base;
    }

    // Calcula la hipotenusa de este triangulo aplicando Pitágoras
    private double calcHipotenusa() {
        return Math.sqrt(Math.pow(base / 2, 2.0) + Math.pow(altura, 2.0));
    }

}
