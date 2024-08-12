import org.junit.Test;
import org.mv.demo.StringProcessor;

import static org.junit.Assert.assertEquals;
public class StringProcessorTest {

    @Test
    public void testProcessString(){
        assertEquals("d", StringProcessor.processString("aabcccbbad"));
    }

    @Test
    public void testAdvancedProcessString(){
        assertEquals("d",StringProcessor.advancedProcessString("abcccbad"));
    }
}
