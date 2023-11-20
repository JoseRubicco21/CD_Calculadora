import java.util.Scanner;

public class App {
    private Calculadora calculadora;
    private Menu menu;
    private Scanner sc;

    App(){
        this.calculadora = new CalculadoraCompleja();
        this.menu = new Menu();
        this.sc = new Scanner(System.in);
    }

    public void run(){
        boolean isFinished = false;
        while (isFinished == false) {
        int operación = this.menu.getSeleccionValida(sc);
        switch (operación) {
            case 0:
                calculadora.reset();
                calculadora.imprimir();
                this.menu.setSeleccion(-1);
                break;
            case 1:
                    calculadora.sumar(menu.getNumvalido(sc));
                    calculadora.imprimir();
                    this.menu.setSeleccion(-1);
                break;
            case 2:

                    calculadora.restar(menu.getNumvalido(sc));
                    calculadora.imprimir();
                    this.menu.setSeleccion(-1);
                break;
            case 3:
                    calculadora.multiplicar(menu.getNumvalido(sc));
                    calculadora.imprimir();
                    this.menu.setSeleccion(-1);
                break;
            case 4:

                    calculadora.dividir(menu.getNumvalido(sc));
                    calculadora.imprimir();
                    this.menu.setSeleccion(-1);
                break;
            case 5: 
                System.exit(0);
                break;
            default:
                break;
            }
     
        }
    }
}
