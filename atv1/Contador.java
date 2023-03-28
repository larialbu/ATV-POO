public class Contador {
    private int valor;
    
    public Contador(int v) {
        this.valor = v;
    }
    
    public void zerar() {
        this.valor = 0;
    }
    
    public void incrementar() {
        this.valor++;
    }
    
    public int getValor() {
        return this.valor;
    }
}
