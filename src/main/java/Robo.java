import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Robo {

    private Integer[][] planoCartesiano;

    private int posicaoInicialY, posicaoInicialx;

    private File arquivo;

    public Robo(int y, int x)  {
        this.planoCartesiano = new Integer[y][x];
        this.posicaoInicialY = 3;
        this.posicaoInicialx = 2;
        arquivo = new File("log.txt");
    }

    public Integer[][] getPlanoCartesiano() {
        return planoCartesiano;
    }

    public Integer andarParaDireta(Integer posicao, Integer valor) {
        gerarLog("andou para direta");
        return this.planoCartesiano[posicaoInicialY][posicaoInicialx + posicao] = valor;
    }

    public Integer andarParaEsquerda(Integer posicao, Integer valor)  {
        gerarLog("andou para esquerda");

        return this.planoCartesiano[posicaoInicialY][posicaoInicialx - posicao] = valor;
    }

    public Integer andarParaBaixo(Integer posicao, Integer valor) {
        gerarLog("andou para baixo");
        return this.planoCartesiano[posicaoInicialY + posicao][posicaoInicialx] = valor;
    }

    public Integer andarParaCima(Integer posicao, Integer valor) {
        gerarLog("andou para cima");
        return this.planoCartesiano[posicaoInicialY - posicao][posicaoInicialx] = valor;
    }

    private void gerarLog(String log) {
        try {

            FileWriter fw = new FileWriter(arquivo, true);

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(log);

            bw.newLine();

            bw.close();
            fw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
