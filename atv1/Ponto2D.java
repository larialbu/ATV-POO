public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistanciaDaOrigem() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double calcularDistancia(Ponto2D outroPonto) {
        double deltaX = this.x - outroPonto.x;
        double deltaY = this.y - outroPonto.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
