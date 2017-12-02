import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoboTest {

    private Robo robo;

    @Before
    public void setup() {
        robo = new Robo(5, 5);
    }

    @Test
    public void deveAndarParaDireta()  {
        robo.andarParaDireta(1, 3);
        assertThat(3, is(robo.getPlanoCartesiano()[3][3]));
    }

    @Test
    public void deveAndarParaEsquerda()  {
        robo.andarParaEsquerda(0, 1);
        assertThat(1, is(robo.getPlanoCartesiano()[3][2]));
    }

    @Test
    public void deveAndarParaBaixo()  {
        robo.andarParaBaixo(1, 1);
        assertThat(1, is(robo.getPlanoCartesiano()[4][2]));
    }

    @Test
    public void deveAndarParaCima() {
        robo.andarParaCima(1, 1);
        assertThat(1, is(robo.getPlanoCartesiano()[2][2]));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void deveLancarExcecaoSeTiverForaDoLimite() {
        robo.andarParaBaixo(1, 0);
        robo.andarParaBaixo(2, 0);
    }


}
