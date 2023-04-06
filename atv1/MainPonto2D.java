public class MainPonto2D {
    public static void main(String[]args) {
    Ponto2D p1 = new Ponto2D(); 
    Ponto2D p2 = new Ponto2D(3, 4);

    double distancia1 = p1.calcularDistanciaDaOrigem();
    double distancia2 = p2.calcularDistanciaDaOrigem();

    System.out.println("Distância de p1 até a origem: " + distancia1);
    System.out.println("Distância de p2 até a origem: " + distancia2);

    double distanciaEntrePontos = p1.calcularDistancia(p2);
    System.out.println("Distância entre p1 e p2: " + distanciaEntrePontos);

    }
}
