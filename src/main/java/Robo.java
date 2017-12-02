public class Robo {

    private Integer[][] planoCartesiano;

    private int posicaoInicialY, posicaoInicialx;

    public Robo(int y, int x) {
        this.planoCartesiano = new Integer[y][x];
        this.posicaoInicialY = 3;
        this.posicaoInicialx = 2;
    }

    public Integer[][] getPlanoCartesiano() {
        return planoCartesiano;
    }

    public Integer andarParaDireta(Integer posicao, Integer valor) {
        return this.planoCartesiano[posicaoInicialY][posicaoInicialx + posicao] = valor;
    }

    public Integer andarParaEsquerda(Integer posicao , Integer valor) {
        return this.planoCartesiano[posicaoInicialY][posicaoInicialx - posicao] = valor; }

    public Integer andarParaBaixo(Integer posicao, Integer valor) {
        return this.planoCartesiano[posicaoInicialY + posicao][posicaoInicialx] = valor;    }

    public Integer andarParaCima(Integer posicao, Integer valor) {
        return this.planoCartesiano[posicaoInicialY - posicao][posicaoInicialx] = valor;    }


}
