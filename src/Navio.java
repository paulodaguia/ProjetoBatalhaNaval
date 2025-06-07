public class Navio {
    private int tamanho;
    private int vida;

    public Navio(int tamanho) {
        this.tamanho = tamanho;
        this.vida = tamanho;
    }

    public void receberDano() {
        if (vida > 0) {
            vida--;
        }
    }

    public boolean estaAfundado() {
        return vida == 0;
    }
}
