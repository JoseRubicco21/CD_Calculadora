import java.util.Scanner;

public class MenuComplejo extends Menu {
    

    @Override
    protected void imprimir(Scanner sc){
        System.out.println("¿Qué operación desea hacer?\nReset [0]\nSumar [1]\nRestar [2]\nMultiplicar [3]\nDividir [4]\nCuadrado [5]\nRaíz [6]\nDeshacer [7]\nSalir [8]");
        int seleccion = sc.nextInt();
        this.seleccion = (seleccion <= 8 & seleccion >= 0) ? this.seleccion = seleccion:-1;
    }
}
