public class MenuTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        //Scanner sc = new Scanner(System.in);
        //menu.imprimir();
        //menu.setSeleccion(sc.nextInt());
        menu.getSeleccionValida();
        System.out.println(menu.getSeleccion());
        //sc.close();
    }
}
