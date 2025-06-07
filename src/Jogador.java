import java.util.HashSet;
import java.util.Set;

public class Jogador {
    private String nome;
    private Set<Integer> posicoesNavios;

    public Jogador(String nome) {
        this.nome = nome;
        this.posicoesNavios = new HashSet<>();
        posicoesNavios.add(1);
        posicoesNavios.add(3);
    }

    public boolean sofrerAtaqueNaPosicao(int posicao) {
        System.out.println(nome + " foi atacado na posição " + posicao + "!");
        if (posicoesNavios.contains(posicao)) {
            posicoesNavios.remove(posicao);
            System.out.println("Navio atingido!");
            return true;
        } else {
            System.out.println("Mas não sofreu dano.");
            return false;
        }
    }

    public boolean todosNaviosAfundados() {
        return posicoesNavios.isEmpty();
    }

    public String getNome() {
        return nome;
    }
}
