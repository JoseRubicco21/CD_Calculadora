
import java.lang.Math;

public class CalculadoraCompleja extends Calculadora {
    
    public void cuadrado(){
        setResultado(getResultado() * getResultado());
    }

    public void raiz(){
        setResultado(Math.sqrt(getResultado()));
    }
}
