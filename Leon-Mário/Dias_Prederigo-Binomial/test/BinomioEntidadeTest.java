import Dias_Prederigo.BinomioEntidade;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author 631220116
 */
public class BinomioEntidadeTest {
    
    public BinomioEntidadeTest() {
        BinomioEntidade e = new BinomioEntidade();
        e.setN(6);
        e.setK(2);
        int atual = e.getCoeficiente(6,2);
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
