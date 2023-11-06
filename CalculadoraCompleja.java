
import java.lang.Math;

public class CalculadoraCompleja extends Calculadora {
    // Could be an arrayList of Doubles to get more number of undos.
    double memoria;

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }
    
    public void cuadrado(){
        setResultado(getResultado() * getResultado());
    }

    public void raiz(){
        setResultado(Math.sqrt(getResultado()));
    }

    public void deshacer(){
        this.setResultado(this.getMemoria());
    }

}
