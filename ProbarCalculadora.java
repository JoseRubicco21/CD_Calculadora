public class ProbarCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.sumar(10);
        calculadora.imprimir();
        calculadora.restar(2);
        calculadora.imprimir();
        calculadora.dividr(2);
        calculadora.imprimir();
        calculadora.multiplicar(4);
        calculadora.imprimir();
        calculadora.reset();
        calculadora.imprimir();

        Calculadora calculadora2 = new Calculadora(22);

        calculadora2.sumar(10);
        calculadora2.imprimir();
        calculadora2.restar(2);
        calculadora2.imprimir();
        calculadora2.dividr(2);
        calculadora2.imprimir();
        calculadora2.multiplicar(4);
        calculadora2.imprimir();
        calculadora2.reset();
        calculadora2.imprimir();
    }
}
