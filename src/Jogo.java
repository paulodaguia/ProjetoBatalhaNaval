import java.util.Scanner;

public class Jogo {
    private Jogador jogador;
    private Computador computador;
    private Scanner scanner;

    public Jogo() {
        this.jogador = new Jogador("Paulo");
        this.computador = new Computador();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("=== BATALHA NAVAL ===");

        while (!jogador.todosNaviosAfundados() && !computador.todosNaviosAfundados()) {
            System.out.println("\nSua vez de atacar:");
            computador.sofrerAtaque();

            if (computador.todosNaviosAfundados()) break;

            System.out.println("\nVez do computador atacar:");
            jogador.sofrerAtaque();
        }

        if (jogador.todosNaviosAfundados()) {
            System.out.println("\nVocê perdeu!");
        } else {
            System.out.println("\nVocê venceu!");
        }

        scanner.close();
    }
}
