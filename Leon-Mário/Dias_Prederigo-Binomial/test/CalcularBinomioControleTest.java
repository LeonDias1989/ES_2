import Dias_Prederigo.CalcularBinomioControle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 631220116
 */
public class CalcularBinomioControleTest {
    
    public CalcularBinomioControleTest() {
        CalcularBinomioControle c = new CalcularBinomioControle();
        int atual = c.calcular(6,2);
        int esperado = 15;
        assertEquals(esperado, atual);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

}
