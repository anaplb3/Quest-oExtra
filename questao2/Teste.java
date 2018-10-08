package questao2;

import org.junit.Before;
import org.junit.Test;
import questao2.lanchonete.FabricaLanchonete;
import questao2.lanchonete.LanchoneteRT;
import questao2.sanduiche.Sanduiche;

public class Teste {
    FabricaLanchonete fabrica;
    Sanduiche sanduba;

    @Before
    public void setUp() {
        fabrica =  new LanchoneteRT();
        sanduba = new Sanduiche(fabrica);
    }

    @Test
    public void testando() {

    }


}
