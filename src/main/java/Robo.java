public class Robo {

    private Integer[][] planoCartesiano;

    public Robo(int y, int x) {
        this.planoCartesiano = new Integer[y][x];
    }

    public Integer[][] getPlanoCartesiano() {
        return planoCartesiano;
    }

    public Integer andarParaDireta(Integer y, Integer x, Integer valor) {
        return this.planoCartesiano[y][x + 1] = valor;
    }

    public Integer andarParaEsquerda(Integer y, Integer x, Integer valor) {
        return this.planoCartesiano[y][x - 1] = valor; }

    public Integer andarParaBaixo(Integer y, Integer x, Integer valor) {
        return this.planoCartesiano[y + 1][x] = valor;    }

    public Integer andarParaCima(Integer y, Integer x, Integer valor) {
        return this.planoCartesiano[y - 1][x] = valor;    }


}
