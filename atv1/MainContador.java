public class MainContador {

    public static void main(String[]args) {
    Contador c = new Contador();

    System.out.println("Valor inicial do contador: " + c.getValor()); 

    c.incrementar();
    c.incrementar();
    System.out.println("Valor atual do contador: " + c.getValor());

    c.zerar();
    System.out.println("Valor atual do contador: " + c.getValor());
    }
}
