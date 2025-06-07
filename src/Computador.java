import java.util.ArrayList;
import java.util.List;

public class Computador {
    private List<Navio> navios;

    public Computador() {
        navios = new ArrayList<>();
        navios.add(new Navio(3));
        navios.add(new Navio(2));
    }

    public void sofrerAtaque() {
        for (Navio navio : navios) {
            if (!navio.estaAfundado()) {
                navio.receberDano();
                if (navio.estaAfundado()) {
                    System.out.println("Você afundou um navio inimigo!");
                } else {
                    System.out.println("Você acertou um navio inimigo!");
                }
                return;
            }
        }
        System.out.println("Todos os navios inimigos já estão afundados.");
    }

    public boolean todosNaviosAfundados() {
        for (Navio navio : navios) {
            if (!navio.estaAfundado()) {
                return false;
            }
        }
        return true;
    }
}
