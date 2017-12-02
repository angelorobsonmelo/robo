import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoboTest {

    private Robo robo;

    @Before
    public void setup() {
        robo = new Robo(5, 5);
    }

    @Test
    public void deveAndarParaDireta() {
        robo.andarParaDireta(0, 0, 3);
        assertEquals(3, robo.getPlanoCartesiano()[0][1].intValue());
    }

    @Test
    public void deveAndarParaEsquerda() {
        robo.andarParaEsquerda(0, 1, 3);
        assertEquals(3, robo.getPlanoCartesiano()[0][0].intValue());
    }

    @Test
    public void deveAndarParaBaixo() {
        robo.andarParaBaixo(0, 0, 1);
        assertEquals(1, robo.getPlanoCartesiano()[1][0].intValue());
    }

    @Test
    public void deveAndarParaCima() {
        robo.andarParaCima(1, 0, 1);
        assertEquals(1, robo.getPlanoCartesiano()[0][0].intValue());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void deveLancarExcecaoSeTiverForaDoLimite() {
        robo.andarParaBaixo(1, 0, 0);
        robo.andarParaBaixo(1, 1, 1);
        robo.andarParaBaixo(1, 2, 2);
        robo.andarParaBaixo(1, 3, 3);
        robo.andarParaBaixo(1, 4, 4);

        robo.andarParaBaixo(1, 5, 5);

    }


}
