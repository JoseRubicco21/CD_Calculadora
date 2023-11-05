import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private int seleccion = -1;

    public int getSeleccion() {
        return seleccion;
    }

    
    public void setSeleccion(int seleccion){
        this.seleccion = seleccion; 
    }

    private void imprimir(Scanner sc){
        System.out.println("¿Qué operación desea hacer?\nReset [0]\nSumar [1]\nRestar [2]\nMultiplicar [3]\nDividir [4]\nCuadrado [5]\nRaíz [6]\nSalir [7]");
        int seleccion = sc.nextInt();
        this.seleccion = (seleccion <= 7 & seleccion >= 0) ? this.seleccion = seleccion:-1;
    }

    public int getSeleccionValida (Scanner sc){
      while(this.seleccion < 0 | this.seleccion > 7) {
        this.imprimir(sc);
        } 
        return this.seleccion;
    }

    public double getNumvalido(Scanner sc){
       
            do {
            try {
                System.out.println("Introduzca un número");
                return sc.nextDouble();
             } catch (InputMismatchException e) {
                System.out.println("Número invalido");
                sc.next();
                return 0;
             }
            } while(!sc.hasNextDouble());
    }

}
