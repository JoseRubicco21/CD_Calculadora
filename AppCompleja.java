import java.util.Scanner;

public class AppCompleja {

    private CalculadoraCompleja calculadora;
    private Menu menu;
    private Scanner sc;

    AppCompleja(){
        this.calculadora = new CalculadoraCompleja();
        this.menu = new MenuComplejo();
        this.sc = new Scanner(System.in);
    }

    public void operarReset(){
        calculadora.setMemoria(calculadora.getResultado());
        calculadora.reset();
        calculadora.imprimir();
        this.menu.setSeleccion(-1);
    }

    public void operarSuma(){
        calculadora.setMemoria(calculadora.getResultado());
        calculadora.sumar(menu.getNumvalido(sc));
        calculadora.imprimir();
        this.menu.setSeleccion(-1);
    }

    public void operarResta(){
        calculadora.setMemoria(calculadora.getResultado());
        calculadora.restar(menu.getNumvalido(sc));
        calculadora.imprimir();
        this.menu.setSeleccion(-1);
    }

    public void operarMultiplicar(){
        
        calculadora.multiplicar(menu.getNumvalido(sc));
        calculadora.imprimir();
        this.menu.setSeleccion(-1);
    }

    public void operarDividir(){
        calculadora.setMemoria(calculadora.getResultado());
        calculadora.dividir(menu.getNumvalido(sc));
        calculadora.imprimir();
        this.menu.setSeleccion(-1);
    }

    public void operarPotencia(){
        calculadora.setMemoria(calculadora.getResultado());
        calculadora.cuadrado();
        calculadora.imprimir();
        this.menu.setSeleccion(-1);
    }

    public void operarRaiz(){
        calculadora.setMemoria(calculadora.getResultado());
        calculadora.raiz();
        calculadora.imprimir();
        this.menu.setSeleccion(-1);
    }
    
    public void operarDeshacer(){
        calculadora.deshacer();
        calculadora.imprimir();
        this.menu.setSeleccion(-1);
    }

    public void salir(){
        System.exit(0);
    }
    public void run(){
        boolean isFinished = false;
        while (isFinished == false) {
        int operación = this.menu.getSeleccionValida(sc);
        switch (operación) {
            case 0:
                operarReset();
                break;
            case 1:
                operarSuma();
                break;
            case 2:
                operarResta();                    
                break;
            case 3:
                operarMultiplicar(); 
                break;
            case 4:
                operarDividir();
                break;  
            case 5:
                operarPotencia();
                break;
            case 6:
                operarRaiz();
            case 7:
                operarDeshacer();
            case 8:
                salir();
                break;
            default:
                break;
            }
     
        }
    }
}