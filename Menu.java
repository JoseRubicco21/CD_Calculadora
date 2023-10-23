import java.util.Scanner;

public class Menu {
    private int seleccion = -1;

    public int getSeleccion() {
        return seleccion;
    }

    /*
    public void setSeleccion(int seleccion){
        this.seleccion = (seleccion <= 4 & seleccion >= 0) ? this.seleccion = seleccion:-1;
    }
    */

    private void imprimir(){
        System.out.println("¿Qué operación desea hacer?\nReset [0]\nSumar [1]\nRestar [2]\nMultiplicar [3]\nDividir [4]");
        Scanner sc  =  new Scanner(System.in);
        int seleccion = sc.nextInt();
        this.seleccion = (seleccion <= 4 & seleccion >= 0) ? this.seleccion = seleccion:-1;
    }

    public int getSeleccionValida (){
        while(this.seleccion < 0 | this.seleccion > 4) {
        this.imprimir();
        }
        return this.seleccion;
    }
}
