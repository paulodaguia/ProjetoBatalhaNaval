public class Unidade {
    private int linha;
    private int coluna;
    private boolean atacada;
    private boolean temNavio;

    public Unidade(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        this.atacada = false;
        this.temNavio = false;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public boolean isAtacada() {
        return atacada;
    }

    public void setAtacada(boolean atacada) {
        this.atacada = atacada;
    }

    public boolean isTemNavio() {
        return temNavio;
    }

    public void setTemNavio(boolean temNavio) {
        this.temNavio = temNavio;
    }
}
