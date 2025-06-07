import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Navio> navios;

    public Jogador(String nome) {
        this.nome = nome;
        this.navios = new ArrayList<>();
        navios.add(new Navio(3));
        navios.add(new Navio(2));
    }

    public String getNome() {
        return nome;
    }

    public void sofrerAtaque() {
        for (Navio navio : navios) {
            if (!navio.estaAfundado()) {
                navio.receberDano();
                System.out.println(nome + " foi atacado! Navio sofreu dano.");
                return;
            }
        }
        System.out.println(nome + " não tem navios restantes para sofrer dano.");
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
