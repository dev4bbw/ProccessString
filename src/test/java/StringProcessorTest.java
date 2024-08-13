import org.junit.Test;
import org.mv.demo.processor.StringProcessor;
import org.mv.demo.strategy.RemoveConsecutiveStrategy;
import org.mv.demo.strategy.ReplaceConsecutiveStrategy;
import org.mv.demo.strategy.StringProcessorStrategy;

import static org.junit.Assert.assertEquals;

/**
 * Title: StringProcessorTest
 * Description：Test of StringProcessor
 *
 * @author Lucas
 * @version 1.0
 */
public class StringProcessorTest {

    /**
     * Test of remove consecutive identical characters strategy
     */
    @Test
    public void testRemoveConsecutiveStrategy() {
        StringProcessorStrategy strategy = new RemoveConsecutiveStrategy();
        StringProcessor processor = new StringProcessor(strategy);

        // testcase
        assertEquals("d", processor.execute("aabcccbbad"));
        assertEquals("", processor.execute("aaabbbccc"));
    }

    /**
     * Test of replace consecutive identical characters strategy
     */
    @Test
    public void testReplaceConsecutiveStrategy() {
        StringProcessorStrategy strategy = new ReplaceConsecutiveStrategy();
        StringProcessor processor = new StringProcessor(strategy);

        // testcase
        assertEquals("d", processor.execute("abcccbad"));
        assertEquals("aacc", processor.execute("abbbcc"));
    }
}
