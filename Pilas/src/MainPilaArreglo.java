public class MainPilaArreglo {
    public static void main(String[] args) {
        PilaArreglo stack = new PilaArreglo();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.mostrarPila();
        System.out.println("-----------------------------");
        System.out.println(stack.topAndPop());
        System.out.println("-----------------------------");
        stack.mostrarPila();
              
      }
}
