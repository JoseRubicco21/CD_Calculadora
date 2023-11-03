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
        System.out.println("¿Qué operación desea hacer?\nReset [0]\nSumar [1]\nRestar [2]\nMultiplicar [3]\nDividir [4]\nSalir [5]");
        int seleccion = Integer.parseInt(sc.nextLine());
        this.seleccion = (seleccion <= 5 & seleccion >= 0) ? this.seleccion = seleccion:-1;
    }

    public int getSeleccionValida (Scanner sc){
      while(this.seleccion < 0 | this.seleccion > 5) {
        this.imprimir(sc);
        } 
        return this.seleccion;
    }

    public double getNumvalido(Scanner sc){
        System.out.println("Introduzca el numero sobre el que operar");
        return Double.parseDouble(sc.nextLine());
    }

}
