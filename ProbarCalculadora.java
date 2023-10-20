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
    }
}
