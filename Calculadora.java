/**
 * Calculadora
 */
public class Calculadora {

    public double resultado = 0;

    // Constructor 

    public Calculadora() {

    }
    // Metodos

    public void sumar(double x){
        this.resultado += x;
    }
     public void restar(double x){
        this.resultado -= x;
    }
     public void dividr(double x){
        this.resultado = this.resultado / x;
    }
     public void multiplicar(double x){
        this.resultado *= x;
    }
     public void reset(){
        this.resultado = 0;
    }
    public void imprimir(){
        System.out.println("El resultado es: " + this.resultado);
    }
}