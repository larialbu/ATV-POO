public class BichinhoVirtual {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean estado;
    private int caloria;
    private int forca;

    public BichinhoVirtual() {
        this.idade = 0;
        this.estado = true;
        this.caloria = 10;
        this.forca = 10;
    }

    public void nascer(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        System.out.println("O animal se chama " + this.nome + " é da classe " + this.classe + " da familia " + this.familia + ". O animal possui força de " + this.forca + ", caloria de " + this.caloria + " e idade de " + this.idade);
    }

    public void morrer() {
        this.forca = 0;
        this.estado = false;
        System.out.println("O animal morreu!");
    }

    public void comer() {
        if (this.estado && this.caloria < 100) {
            this.caloria += 10;
            this.forca -= 2;
            System.out.println("O animal comeu e agora sua força é de " + this.forca +" e suas calorias valem " + this.caloria);
            if(this.estado && this.caloria <= 0 ){
                System.out.println("O animal morreu!");
            }
        }
    }

    public void correr() {
        if (this.estado && this.caloria > 0) {
            this.forca -= 5;
            this.caloria -= 5;
            System.out.println("O animal está correndo!! Agora sua força é de " + this.forca + " e suas calorias valem " + this.caloria);
            if(this.estado && this.caloria <= 0 ){
                System.out.println("O animal morreu!");
            }
        }
    }

    public void dormir() {
        if (this.estado) {
            this.forca += 10;
            this.caloria -= 2;
            System.out.println("O animal está dormindo agora! Sua força aumentou para " + this.forca + " e suas calorias aumentaram para " + this.caloria);
            if(this.estado && this.forca <= 0 ){
                System.out.println("O animal morreu!");
            }
        }
    }

    public boolean getEstado() {
        return estado;
    }
}
