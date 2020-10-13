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
    
    public double getbase(){
        return base;
    }
    public void setbase(double base){
        this.base = base;
    }

    public double getaltura(){
        return altura;
    }
    public void setaltura(double altura){
        this.altura = altura;
    }

    /* Calcula el área de este triangulo */
    public double area() throws Exception {
        double area = (base*altura)/2;
        if(area <=0) throws new Exception("L'area no pot ser negativa");
        return area;
    }
    private double Hipotenusa() {
        double hipotenusa;
        hipotenusa = Math.sqrt(((base/2)*(base/2)) + ((altura)*(altura)));
        return hipotenusa;
         }

    /* Calcula el perímetro de este triangulo conocida su base y altura */
    public double perimetro(hipotenusa) {
        double perimetro = hipotenusa*2 + base;
        if(perimetro <=0) throws new Exception("El perimetre no pot ser negatiu");
        return perimetro;
    }
    

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(19.0, 17.0);
        System.out.println(t1);
        try {

            System.out.println(t1.area());
            System.out.println(t1.perimetro());
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    
}
