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
            System.out.print("Escolha uma posição para atacar (0 a 4): ");
            int posicaoAtaque = scanner.nextInt();

            computador.sofrerAtaqueNaPosicao(posicaoAtaque);

            if (computador.todosNaviosAfundados()) break;

            System.out.println("\nVez do computador atacar:");
            int posicaoComputador = (int)(Math.random() * 5);
            jogador.sofrerAtaqueNaPosicao(posicaoComputador);
        }

        if (jogador.todosNaviosAfundados()) {
            System.out.println("\nVocê perdeu!");
        } else {
            System.out.println("\nVocê venceu!");
        }

        scanner.close();
    }
}
