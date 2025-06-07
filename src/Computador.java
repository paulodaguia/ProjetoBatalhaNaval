import java.util.HashSet;
import java.util.Set;

public class Computador {
    private Set<Integer> posicoesNavios;

    public Computador() {
        this.posicoesNavios = new HashSet<>();
        posicoesNavios.add(0);
        posicoesNavios.add(2);
    }

    public boolean sofrerAtaqueNaPosicao(int posicao) {
        if (posicoesNavios.contains(posicao)) {
            posicoesNavios.remove(posicao);
            System.out.println("Você acertou o navio inimigo na posição " + posicao + "!");
            return true;
        } else {
            System.out.println("Você errou o ataque na posição " + posicao + ".");
            return false;
        }
    }

    public boolean todosNaviosAfundados() {
        return posicoesNavios.isEmpty();
    }
}
