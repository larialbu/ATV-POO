import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do animal: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a classe do animal: ");
        String classe = scanner.nextLine();

        System.out.print("Digite a família do animal: ");
        String familia = scanner.nextLine();

        BichinhoVirtual animal = new BichinhoVirtual();
        animal.nascer(nome, classe, familia);

        while (animal.getEstado()) {
            System.out.println("\nEscolha uma ação para o animal:");
            System.out.println("1 - Comer");
            System.out.println("2 - Correr");
            System.out.println("3 - Dormir");
            System.out.println("4 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    animal.comer();
                    break;
                case 2:
                    animal.correr();
                    break;
                case 3:
                    animal.dormir();
                    break;
                case 4:
                    animal.morrer();
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        }
    }
}