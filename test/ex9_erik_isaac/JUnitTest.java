package ex9_erik_isaac;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 
 * @author Erik_Isaac
 * @version 18/10/2016 1.0
 */
@RunWith(Parameterized.class)
public class JUnitTest {
    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
            {1390, "MCCCXC"},{1400, "MCD"},{3470, "MMMCDLXX"}
        });
    }
    
    private int fInput;
    private String fExpected;
    
    public JUnitTest(int input, String expected) {
        fInput = input;
        fExpected = expected;
    }
    
    @Test
    public void test() {
        Conversor conversor = new Conversor();
        assertEquals(fExpected, conversor.numberToRomanic(fInput));
    }
}
