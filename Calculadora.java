/**
 * Calculadora
 */
public class Calculadora {

    private double resultado = 0;

    // Constructor 

    public Calculadora() {

    }

    public Calculadora(double x) {
        this.resultado = x;
    }
    // Metodos

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return this.resultado;
    }

    public void sumar(double x){
        this.resultado += x;
    }
     public void restar(double x){
        this.resultado -= x;
    }
     public void dividir(double x){
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